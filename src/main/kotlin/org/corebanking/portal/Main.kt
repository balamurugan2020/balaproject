package com.virtusa.capstone.capstone

import org.corebanking.portal.controller.CreditCardController
import org.corebanking.portal.controller.MilesController
import org.corebanking.portal.entity.MasterCard
import org.corebanking.portal.service.CardManagerImpl
import org.corebanking.portal.service.MilesManagerImpl
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import org.corebanking.portal.controller.TransactionController
import org.corebanking.portal.entity.CreditCard
import org.corebanking.portal.entity.Miles
import org.corebanking.portal.entity.Transaction
import org.corebanking.portal.service.TransactionManagerImpl
import org.corebanking.portal.service.Utils
fun main(args: Array<String>) = runBlocking {
        val channel = Channel<MasterCard>()

        val channelMiles = Channel<Miles>()
        val channelTransaction = Channel<Transaction>()

        val cardManager = CardManagerImpl;
        var creditCardController = CreditCardController(cardManager)

        val milesManager = MilesManagerImpl;
        var milesController = MilesController(milesManager)

        val transManager = TransactionManagerImpl;
        var transController = TransactionController(transManager, milesController)


        // Launch a coroutine to perform CRUD operations
        val job = launch {
            for (card in channel) {
                creditCardController.saveOrUpdateCreditCard(card)
                // Simulate a CRUD operation
                println("Processing card: $card")
            }

            println(creditCardController.getCreditCard("12347"))
        }

        val jobMiles = launch {
            for (miles in channelMiles) {
                milesController.saveOrUpdateMile(miles)
                // Simulate a CRUD operation
                println("Processing miles: $miles")
            }

            println(milesController.getMiles("1234D"))
        }

        val jobTransaction = launch {
            for (transaction in channelTransaction) {
                transController.saveOrUpdateTransaction(transaction)
                // Simulate a CRUD operation
                println("Processing transaction: $transaction")
            }

            println(transController.getTransaction("12345"))
        }

        val jobMilesEligible = launch {
            delay(2000L)
            println("Miles Details Eligible")
            println(milesController.getAllMiles())
        }

        val cardList: MutableList<MasterCard> =  Utils.getMockMasterCard()
        for(card in cardList) {
            channel.send(card)
        }

        val milesList: MutableList<Miles> =  Utils.getMockMiles()
        for(miles in milesList) {
            channelMiles.send(miles)
        }

        val transactionList: MutableList<Transaction> =  Utils.getMockTransactions()
        for(transactions in transactionList) {
            channelTransaction.send(transactions)
        }



        // Close the channel to signal no more items
        channel.close()
        channelMiles.close()
        channelTransaction.close()

        // Wait for the job to complete
        job.join()
        jobMiles.join()
        jobTransaction.join()
        jobMilesEligible.join()
}
