package org.corebanking.portal.entity

import java.sql.Date

data class Miles (
    internal var id: Int?,
    internal var mileId: String?,
    internal var rewardPoints: Int,
    internal var rewardPointReceivedDate: Date?,
    internal var cardNumber: String?,
    internal var isConsumed: Boolean
)