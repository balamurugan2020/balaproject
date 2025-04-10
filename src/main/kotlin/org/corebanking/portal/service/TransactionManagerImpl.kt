package org.corebanking.portal.service

import org.corebanking.portal.entity.Transaction

object TransactionManagerImpl: TransactionManager {

    var transactionMap = HashMap<String?, Transaction>()

    override fun saveOrUpdateTransaction(transaction: Transaction) {
        transactionMap.put(transaction.cardNumber, transaction)
    }

    override fun deleteTansaction(transaction: Transaction) {
        transactionMap.remove(transaction.cardNumber)
    }

    override fun getTransaction(cardNumber: String): Transaction? {
        return transactionMap[cardNumber]
    }

    override fun getAllTransactions(): MutableList<Transaction> {
        return transactionMap.values.toMutableList()
    }
}