package com.company;

public class Audi extends Cars {

    private String owner;
    private int year;

    public Audi(String model, String color, double volune, String owner, int year) {
        super(model, color, volune);
        this.owner = owner;
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String print() {
        return (getModel()+ " " + getColor() + " " + " " + year + " " + getVolune() + " "+ owner);
    }
}
