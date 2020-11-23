package com.company;

public abstract class Cars implements Printable {
    private String model;
    private String color;
    private double volune;


    public Cars(){

    }

    public Cars(String model, String color, double volune) {
        this.model = model;
        this.color = color;
        this.volune = volune;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolune() {
        return volune;
    }

    public void setVolune(double volune) {
        this.volune = volune;
    }
}
