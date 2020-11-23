package com.company;

public class Mercedes extends Cars {

    private String pilot;
    private double lapTime;

    public Mercedes(String model, String color, double volune, String pilot, double lapTime) {
        super(model, color, volune);
        this.pilot = pilot;
        this.lapTime= lapTime;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public double getLapTime() {
        return lapTime;
    }

    public void setLapTime(double lapTime) {
        this.lapTime = lapTime;
    }

    @Override
    public void print() {
        return super.print();
    }
}
