package org.corebanking.portal.service

import org.corebanking.portal.entity.Miles

object MilesManagerImpl: MilesManager {
    var mileMap = HashMap<String?, Miles>()

    override fun saveOrUpdateMile(mile: Miles) {
        mileMap.put(mile.cardNumber, mile)
    }

    override fun deleteMile(mile: Miles) {
        mileMap.remove(mile.cardNumber)
    }

    override fun getMile(milesId: String): Miles? {
        mileMap.values.forEach {
            if (it.mileId == milesId) {
                return it
            }
        }
        return null
    }

    override fun getAllMiles(): MutableList<Miles> {
        return mileMap.values.toMutableList()
    }

    override fun getMilesForCardNumber(cardNumber: String): Miles? {
        return mileMap[cardNumber]
    }
}