package org.corebanking.portal.entity

import jakarta.persistence.*


open class CreditCard (open internal var id:Long, open internal var cardNumber: String, open internal var ownersName: String, open internal var cvv: String, open internal var expiryDate: String, open internal var cardType: String) {

    /* var id: Long? = null
     var cardNumber: String? = null
     var ownersName: String? = null
     var cvv: String? = null
     var expiryDate: String? = null
     open var cardTye: String? = null

     fun updateFields(id: Long, cardNumber: String, ownersName:String, cvv: String?, expiryDate: String?, cardTye: String) {
         this.id = id
         this.cardNumber = cardNumber
         this.ownersName = ownersName
         this.cvv = cvv
         this.expiryDate = expiryDate
         this.cardTye = cardTye
     }*/

    /*fun updateFields(id: Long, cardNumber: String, ownersName:String, cvv: String?, expiryDate: String?) {
        this.id = id
        this.cardNumber = cardNumber
        this.ownersName = ownersName
        this.cvv = cvv
        this.expiryDate = expiryDate
    }*/
}