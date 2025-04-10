package org.corebanking.portal.service

import org.corebanking.portal.entity.Miles

class MileService(val mileRepository: org.corebanking.portal.repository.MilesRepositoryImpl) {
    // var mileRepository = MilesRepository()

    fun saveOrUpdateMile(mile: Miles) {
        mileRepository.saveOrUpdateMile(mile)
    }

    fun getMile(mileId: String): Miles? {
        return mileRepository.getMile(mileId)
    }

    fun removeMile(mile: Miles) {
        mileRepository.deleteMile(mile)
    }

    fun getAllMiles(): MutableList<Miles> {
        return mileRepository.getAllMiles()
    }

}