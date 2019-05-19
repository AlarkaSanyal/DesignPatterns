package com.examples.builder;

public class Trouser extends Bottom {

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String name() {
        return "This is a Trouser";
    }
}
