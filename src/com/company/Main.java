package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Bmw",4.4).print();
        createObject("Audi ", 4.2).print();
        createObject("Mercedes", 4.7).print();
    }

    public static   Cars createObject(String name, double volune) {
        if (name.equals(Bmw.class.getSimpleName())){
            return new Bmw ("M5","Black", 4.4, 330,1993);
        } else if (name.equals(Audi.class.getSimpleName())){
            return new Audi("S8","White", 4.3,"jOHN", "Stutgard");
        } else if (name.equals(Mercedes.class.getSimpleName())){
            return new Mercedes("E500AMG","Stripe",4.7,"Tomy Mackenin",13.33);
        } else {
            return new Cars() {
            };
        }

    }
}
