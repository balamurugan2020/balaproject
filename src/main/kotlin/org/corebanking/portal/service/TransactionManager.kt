package org.corebanking.portal.service

import org.corebanking.portal.entity.CreditCard
import org.corebanking.portal.entity.Transaction

interface TransactionManager {
    fun saveOrUpdateTransaction(transaction: Transaction): Unit
    fun deleteTansaction(transaction: Transaction): Unit
    fun getTransaction(cardNumber: String): Transaction?
    fun getAllTransactions(): MutableList<Transaction>
}