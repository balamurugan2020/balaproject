package org.corebanking.portal.entity

import jakarta.persistence.*

data class Transaction (
    internal var id: Int?,
    internal var cardNumber: String?,
    internal var action: String?,
    internal var amount: Double,
    internal var description: String?,
    internal var timestamp: String?

)