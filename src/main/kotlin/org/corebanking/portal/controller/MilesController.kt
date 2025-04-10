package org.corebanking.portal.controller

import org.corebanking.portal.entity.Miles
import org.corebanking.portal.service.CardManager
import org.corebanking.portal.service.MilesManager

/*import com.virtusa.capstone.entity.Mile
import com.virtusa.capstone.service.MileService*/

class MilesController(val milesManager: MilesManager) {
    //var milesService =  MileService()

    fun saveOrUpdateMile(miles: Miles) {
        val cardMiles: Miles? = getMilesForCardNumber(miles.cardNumber.toString())
        var rewardPoints:Int = cardMiles?.rewardPoints ?: 0
        if (cardMiles != null) {
            if(miles.cardNumber == cardMiles.cardNumber) {
                if(cardMiles.rewardPoints != 0) {
                    rewardPoints += miles.rewardPoints
                }
            }
        }
        miles.rewardPoints = rewardPoints
        milesManager.saveOrUpdateMile(miles)
    }

    fun getMiles(mileId: String): Miles? {
        return milesManager.getMile(mileId)
    }

    fun deleteMile(miles: Miles) {
        milesManager.deleteMile(miles)
    }

    fun getAllMiles(): MutableList<Miles> {
        return milesManager.getAllMiles()
    }

    fun getMilesForCardNumber(cardNumber: String): Miles? {
        return milesManager.getMile(cardNumber)
    }
}