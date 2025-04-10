package org.corebanking.portal.service

import org.corebanking.portal.entity.Miles

interface MilesManager {
    fun saveOrUpdateMile(mile: Miles): Unit
    fun deleteMile(mile: Miles): Unit
    fun getMile(mileId: String): Miles?
    fun getAllMiles(): MutableList<Miles>
    fun getMilesForCardNumber(cardNumber: String): Miles?
}