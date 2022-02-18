package com.objects;

public class Game<T> extends Borrowable {
    private String serialNumber;
    private String Title;
    private String gameFormat; //e.g. boardGame, XBOX, PC, PS, DS
    private double overdueDailyCharge;


    public Game(String serialNumber, String title, String gameFormat, double overdueDailyCharge) {
        this.serialNumber = serialNumber;
        Title = title;
        this.gameFormat = gameFormat;
        this.overdueDailyCharge = overdueDailyCharge;
    }

    @Override
    public String toString() {
        return "Game{" +
                "serialNumber='" + serialNumber + '\'' +
                ", Title='" + Title + '\'' +
                ", gameFormat='" + gameFormat + '\'' +
                ", overdueDailyCharge=" + overdueDailyCharge +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGameFormat() {
        return gameFormat;
    }

    public void setGameFormat(String gameFormat) {
        this.gameFormat = gameFormat;
    }

    public double getOverdueDailyCharge() {
        return overdueDailyCharge;
    }

    public void setOverdueDailyCharge(double overdueDailyCharge) {
        this.overdueDailyCharge = overdueDailyCharge;
    }
}

