package com.examples.builder;

public abstract class Bottom implements Item {

    @Override
    public Material material() {
        return new Leather();
    }

    @Override
    public abstract int price();
}
