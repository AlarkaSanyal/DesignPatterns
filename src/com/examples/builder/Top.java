package com.examples.builder;

public abstract class Top implements Item {

    @Override
    public Material material() {
        return new Cotton();
    }

    @Override
    public abstract int price();
}
