package com.company;

public class Audi extends Cars {

    private String state;
    private String owner;

    public Audi(String model, String color, double volune, String owner, String state) {
        super(model, color, volune);
        this.owner = owner;
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public void print() {
        System.out.println(getModel() + " " + getVolune() + " " + getColor() + " " + owner + " " + state);
    }


}
