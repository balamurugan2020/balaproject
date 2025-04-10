package org.corebanking.portal.controller

import org.corebanking.portal.entity.Miles
import org.corebanking.portal.entity.Transaction
import org.corebanking.portal.service.MilesManager
import org.corebanking.portal.service.TransactionManager

class TransactionController(val transactionManager: TransactionManager, val milesController: MilesController) {

    fun saveOrUpdateTransaction(transaction: Transaction) {
        if(transaction.amount > 1000) {
            val miles = Miles(
                id = null,
                mileId = null,
                rewardPoints = getRewardPointCalc(transaction.amount),
                rewardPointReceivedDate = java.sql.Date(System.currentTimeMillis()),
                cardNumber = transaction.cardNumber,
                isConsumed = false
            )
            milesController.saveOrUpdateMile(miles)
        }
        transactionManager.saveOrUpdateTransaction(transaction)
    }

    fun getRewardPointCalc(amount: Double): Int {
        return (amount/1000*10).toInt()
    }
    fun getTransaction(cardNumber: String): Transaction? {
        return transactionManager.getTransaction(cardNumber)
    }

    fun deleteTransaction(transaction: Transaction) {
        transactionManager.deleteTansaction(transaction)
    }

    fun getAllTransaction(): MutableList<Transaction> {
        return transactionManager.getAllTransactions()
    }
}