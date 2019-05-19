package com.examples.builder;

public class Shirt extends Top {

    @Override
    public int price() {
        return 10;
    }

    @Override
    public String name() {
        return "This is a Shirt";
    }
}
