package org.example;

public class Sample {
    public static void main(String[] args) {

        Fruit f=new MangoSeed("yellow", "sweet");
        //MangoSeed m= new MangoSeed("green", "sour");
        f.place();
        MangoSeed m=(MangoSeed)f;
        m.place();
        /*if (f.isTasty()) {
            System.out.println("Fruit is sweet");
        } else {
            System.out.println("Fruit is not sweet");
        }
        if (m.isTasty()) {
            System.out.println("Fruit is sweet");
        } else {
            System.out.println("Fruit is not sweet");
        }*/


    }
}
