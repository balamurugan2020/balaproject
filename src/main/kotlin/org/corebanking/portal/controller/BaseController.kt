package org.corebanking.portal.controller

import org.corebanking.portal.entity.CreditCard

abstract class BaseController {
    abstract fun saveOrUpdateCreditCard(creditCard: CreditCard) : Unit
    abstract fun deleteCreditCard(creditCard: CreditCard) : Unit
    abstract fun getCreditCard(cardNumber: String): CreditCard?
    abstract fun getAllCreditCards(): MutableList<CreditCard>
}