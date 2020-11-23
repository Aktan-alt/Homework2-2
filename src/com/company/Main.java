package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(createObject("Bmw", 2.0).print());

        System.out.println(createObject("Audi", 2.5).print());

        System.out.println(createObject("Mercedes", 1.8).print());
    }

    public static Cars createObject(String name, double volune) {
        if (name.equals(Bmw.class.getSimpleName())){
            return new Bmw ("M5","Black", 4.4, "Krasav4ik",1991);
        } else if (name.equals(Audi.class.getSimpleName())){
            return new Audi("S8","White", 4.3,"John",1993);
        } else if (name.equals(Mercedes.class.getSimpleName())){
            return new Mercedes("E500AMG","Stripe",4.7,"NeKrasav4ik",1990);
        } else {
            return new Cars() {
                @Override
                public String print() {

                    System.out.println("111");
                    return null;
                }
            };
        }

    }
}
