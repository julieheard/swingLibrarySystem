package com.objects;

import java.time.LocalDate;
import java.time.Period;

public class Loan<T extends Borrowable> {

    //Use java generics for borrowableItem
    private Borrower borrower;
    private T borrowedItem;
    private LocalDate borrowDate;
    private LocalDate dateDueBack;
    private LocalDate dateReturned;
    private double overDueCharges;

    public Loan(Borrower borrower, T borrowedItem, LocalDate borrowDate, int numOfDaysBorrowed) {
        this.borrower = borrower;
        this.borrowedItem = borrowedItem;
        this.borrowDate = borrowDate;
        this.dateDueBack = borrowDate.plusDays(numOfDaysBorrowed);
        this.dateReturned = null;
        this.overDueCharges = 0.00;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "borrower=" + borrower +
                ", borrowedItem=" + borrowedItem +
                ", borrowDate=" + borrowDate +
                ", dateDueBack=" + dateDueBack +
                ", returned=" + dateReturned +
                ", overDueCharges=" + overDueCharges +
                '}';
    }

    //No set methods as we do not want user to change loan once initialised
    public Borrower getBorrower() {
        return borrower;
    }

    public T getBorrowedItem() {
        return borrowedItem;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDateDueBack() {
        return dateDueBack;
    }

    public LocalDate dateReturned() {
        return dateReturned;
    }

    public void returnBook() {
        this.dateDueBack = LocalDate.now();
    }

    public double getOverDueCharges() {

        if (dateReturned == null) {
            return 0.00;
        } else {
            if (dateReturned.isBefore(dateDueBack)) {
                return 0.00;
            } else {
                //get amount of days between date returned and date dueback
                Period period = Period.between(dateDueBack, dateReturned);

                double charge = 0 - (period.getDays() * borrowedItem.getOverdueDailyCharge());//0- to make it a negative //At the moment returning 0.0

                //need to round to 2 dp
                overDueCharges = charge;
                borrower.addCharge(charge);
            }
            return overDueCharges;
        }
    }


    //Just for testing
    public void testOverDueCharges() {
        this.dateDueBack = LocalDate.of(2022, 01, 01);
        this.dateReturned = LocalDate.of(2022, 01, 30);
    }


}
