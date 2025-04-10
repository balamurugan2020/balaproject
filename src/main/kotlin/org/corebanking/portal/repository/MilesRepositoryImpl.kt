package org.corebanking.portal.repository

import org.corebanking.portal.entity.Miles

object MilesRepositoryImpl:
    org.corebanking.portal.repository.MilesRepository {

     var mileMap = HashMap<String?, Miles>()

     override fun saveOrUpdateMile(mile: Miles) {
        mileMap.put(mile.mileId, mile)
    }

     override fun deleteMile(mile: Miles) {
        mileMap.remove(mile.mileId)
    }

     override fun getMile(mileId: String): Miles? {
        return mileMap[mileId]
    }

     override fun getAllMiles(): MutableList<Miles> {
        return mileMap.values.toMutableList()
    }
}