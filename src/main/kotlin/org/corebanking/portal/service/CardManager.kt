package org.corebanking.portal.service

import org.corebanking.portal.entity.CreditCard

interface CardManager {
    fun saveOrUpdateCreditCard(creditCard: CreditCard): Unit
    fun deleteCreditCard(creditCard: CreditCard): Unit
    fun getCreditCard(cardNumber: String): CreditCard?
    fun getAllCreditCards(): MutableList<CreditCard>
}