package org.corebanking.portal.service

import org.corebanking.portal.entity.MasterCard
import org.corebanking.portal.entity.Miles
import org.corebanking.portal.entity.Transaction

object Utils {
    fun getMockMasterCard(): MutableList<MasterCard> {
        return mutableListOf(
            MasterCard(1, "1234 3456 4566 3455", "Bala", "123", "12-24-25"),
            MasterCard(2, "12345", "Murugan", "225", "12-25-25"),
            MasterCard(3, "12346", "Kumar", "675", "12-26-25"),
            MasterCard(4, "12347", "Kannan", "298", "12-27-25"))
    }

    fun getMockMiles(): MutableList<Miles> {
        return mutableListOf(Miles(1, "1234A", 0,  java.sql.Date(System.currentTimeMillis()), "1234 3456 4566 3455", false),
            Miles(2, "1234B", 0, java.sql.Date(System.currentTimeMillis()), "12345", false ),
            Miles(3, "1234C", 0, java.sql.Date(System.currentTimeMillis()), "12346", false ),
            Miles(4, "1234D", 0, java.sql.Date(System.currentTimeMillis()), "12347", false ))
    }

    fun getMockTransactions(): MutableList<Transaction> {
        return mutableListOf(
            Transaction(1, "12345", "BUY",  1000.00, "Buy Groceries", java.sql.Date(System.currentTimeMillis()).toString()),
            Transaction(2, "12345", "BUY",  10000.00, "For Buy Fridge", java.sql.Date(System.currentTimeMillis()).toString()),
            Transaction(3, "12345", "BUY",  50000.00, "For Buy TV", java.sql.Date(System.currentTimeMillis()).toString()),
            Transaction(4, "12345", "BUY",  1000.00, "Buy Groceries", java.sql.Date(System.currentTimeMillis()).toString())
        )
    }
}