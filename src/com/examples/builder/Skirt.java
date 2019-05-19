package com.examples.builder;

public class Skirt extends Bottom {

    @Override
    public int price() {
        return 30;
    }

    @Override
    public String name() {
        return "This is a Skirt";
    }
}
