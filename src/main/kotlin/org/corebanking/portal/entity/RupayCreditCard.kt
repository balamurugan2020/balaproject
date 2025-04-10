package org.corebanking.portal.entity

data class RupayCreditCard (override var id:Long, override var cardNumber: String, override var ownersName: String, override var cvv: String, override var expiryDate: String, override var cardType: String = "MASTER_CARD") : CreditCard(id,cardNumber,ownersName,cvv,expiryDate, cardType)