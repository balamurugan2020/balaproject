package org.corebanking.portal.repository

import org.corebanking.portal.entity.CreditCard

class CreditCardRepositoryImpl() :
    org.corebanking.portal.repository.CreditCardRepository {
    var creditCardMap = HashMap<String?, CreditCard>()
    //var creditCardMap = creditCardMap
    fun saveOrUpdateCreditCard(creditCard: CreditCard) {
        creditCardMap.put(creditCard.cardNumber, creditCard)
    }

    fun deleteCreditCard(creditCard: CreditCard) {
        creditCardMap.remove(creditCard.cardNumber)
    }

    fun getCreditCard(cardNumber: String): CreditCard? {
        return creditCardMap[cardNumber]
    }

    fun getAllCreditCards(): MutableList<CreditCard> {
        return creditCardMap.values.toMutableList()
    }
}