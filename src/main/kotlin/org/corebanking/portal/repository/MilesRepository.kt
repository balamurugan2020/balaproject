package org.corebanking.portal.repository

import org.corebanking.portal.entity.Miles

interface MilesRepository {
    fun saveOrUpdateMile(mile: Miles)
    fun deleteMile(mile: Miles)
    fun getMile(mileId: String): Miles?
    fun getAllMiles(): MutableList<Miles>

}