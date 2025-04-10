package org.corebanking.portal.service

import org.corebanking.portal.entity.CreditCard

object CardManagerImpl : CardManager {
    val creditCardMap = HashMap<String, CreditCard> ()
    // var creditCardMap = creditCardMap
    override fun saveOrUpdateCreditCard(creditCard: CreditCard) {
        creditCard.cardNumber?.let { creditCardMap.put(it, creditCard) }
    }

     override fun deleteCreditCard(creditCard: CreditCard) {
        creditCardMap.remove(creditCard.cardNumber)
    }

     override fun getCreditCard(cardNumber: String): CreditCard? {
        return creditCardMap[cardNumber]
    }

    override fun getAllCreditCards(): MutableList<CreditCard> {
        return creditCardMap.values.toMutableList()
    }
}