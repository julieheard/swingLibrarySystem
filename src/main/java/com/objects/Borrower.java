package com.objects;

public class Borrower {
    private int id;
    private String name;
    private String email;
    private double balance; //For overdue chargaes payable. Defaults to 0.00 when borrower first created

    public Borrower(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        balance = 0.00;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void addCharge(double charge){
        this.balance = this.balance + charge;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
