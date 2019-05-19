package com.examples.singleton;

public class Singleton {

    // private object
    private static Singleton instance;

    // private constructor
    private Singleton() {
    }

    // public static object initializer
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Printing a Singleton message");
    }
}
