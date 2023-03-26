package org.example;

public class Mango extends Fruit{
    boolean isAvailable;
    boolean isGrove;

    public Mango(String color, String taste) {
        super(color, taste);
        //System.out.println("Welcome - child class");
    }
    public void place()
    {
        System.out.println("Welcome - child class");
    }
    public boolean isFruitAvailable()
    {
        return isAvailable;
    }

    public boolean isFruitGrove()
    {
        return isGrove;
    }

}
