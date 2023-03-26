package org.example;

public class Fruit {
    String color;
    String taste;

    public Fruit (String color, String taste)
    {
        this.color=color;
        this.taste=taste;

    }
    public void place()
    {
        System.out.println("Welcome - parent class");
    }
    public boolean isTasty() {
        return taste.equals("sweet");
    }
}
