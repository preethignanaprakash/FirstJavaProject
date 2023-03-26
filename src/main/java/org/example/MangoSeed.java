package org.example;

public class MangoSeed extends Mango{
String seed=null;
    public MangoSeed(String color, String taste) {
        super(color, taste);
        //System.out.println(("Welcome - grandchild class"));
    }
    public boolean isTasty() {
        return taste.equals("sweet");
    }
    public void place()
    {
        System.out.println("Welcome - grandchild class");
    }
}
