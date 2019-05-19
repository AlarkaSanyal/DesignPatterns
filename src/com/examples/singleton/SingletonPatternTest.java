package com.examples.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.print("1. ");
        singleton1.print();
        System.out.print("2. ");
        singleton2.print();

        if (singleton1.equals(singleton2)) {
            System.out.println("Both instances are equal");
        } else {
            System.out.println("Different instances are created");
        }
    }
}
