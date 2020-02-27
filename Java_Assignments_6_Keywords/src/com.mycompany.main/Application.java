package com.mycompany.main;

public class Application {
    public static void main(String[] args) {
        float x, y;
        x = 34.66f;
        y = 256.23f;

        add add = new add();
        System.out.println("Addition results: " + StaticClass.add(x, y));

        FinalClass fc = new FinalClass();
        System.out.println("Final constant: " + fc.myConstant);

        ConcreteClass cc = new ConcreteClass();
        cc.run();
    }
}