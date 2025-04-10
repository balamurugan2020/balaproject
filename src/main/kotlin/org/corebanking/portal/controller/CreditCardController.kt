package org.corebanking.portal.controller

import org.corebanking.portal.entity.CreditCard
import org.corebanking.portal.service.CardManager

// import com.virtusa.capstone.entity.CreditCard
// import com.virtusa.capstone.service.CreditCardService


class CreditCardController(val creditCardManager: CardManager): BaseController() {

    override fun saveOrUpdateCreditCard(creditCard: CreditCard) : Unit {
        creditCardManager.saveOrUpdateCreditCard(creditCard)
    }

    override fun deleteCreditCard(creditCard: CreditCard) : Unit {
        creditCardManager.deleteCreditCard(creditCard)
    }

    override fun getCreditCard(cardNumber: String): CreditCard? {
        return creditCardManager.getCreditCard(cardNumber)
    }

    override fun getAllCreditCards(): MutableList<CreditCard> {
        return creditCardManager.getAllCreditCards()
    }
}