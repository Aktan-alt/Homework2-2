package com.company;

public class Bmw extends Cars {
    private double speed;
    private int year;

    public Bmw(String model, String color, double volune, double speed, int year) {
        super(model, color, volune);
        this.speed = speed;
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print(){
        System.out.println(getModel() + " " + getVolune() + " " + getColor() +" " + speed +" " + year);
    }

}
