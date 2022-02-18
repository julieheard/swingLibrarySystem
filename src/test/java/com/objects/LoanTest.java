package com.objects;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    //Dummy objects for tests
    static Borrower borrower;
    static Book book;
    static Game game;

    @BeforeAll
    static void setUp(){
         borrower = new Borrower( 1234356, "James", "James@James.com");
         book = new Book("123qwe", "1234355677869", "Julie", "Algorithms", 0.70);
         game = new Game("098poi", "Jumanji", "BoardGame", 1.50);
    }

    @AfterAll
    static void tearDown(){
        borrower = null;
        book = null;
        game = null;
    }

    @Test
    void testAddingLoans() {
        Loan newLoan = new Loan(borrower, book, LocalDate.now(), 7);
        Loan newLoan2 = new Loan(borrower, game, LocalDate.now(), 7);
    }

    @Test
    void testOverDueCharges(){
        Loan newLoan = new Loan(borrower, book, LocalDate.now(), 7);
        assertEquals(newLoan.getOverDueCharges(),0.00);
    }

    @Test
    void testNegativeOverDueCharges(){
        Loan newLoan = new Loan(borrower, book, LocalDate.now(), 7);
        newLoan.testOverDueCharges();
        System.out.println(newLoan.getOverDueCharges());
        assertTrue(newLoan.getOverDueCharges() < 0);
    }


}