package com.objects;

public class Book <T> extends Borrowable {
    private String serialNumber;
    private String ISBN;
    private String Author;
    private String Title;
    private double overdueDailyCharge;

    public Book(String serialNumber, String ISBN, String author, String title, double overdueCharge) {
        this.serialNumber = serialNumber;
        this.ISBN = ISBN;
        Author = author;
        Title = title;
        this.overdueDailyCharge = overdueCharge;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialNumber='" + serialNumber + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", overdueCharge=" + overdueDailyCharge +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getOverdueDailyCharge() {
        return overdueDailyCharge;
    }

    public void setOverdueDailyCharge(double overdueDailyCharge) {
        this.overdueDailyCharge = overdueDailyCharge;
    }
}
