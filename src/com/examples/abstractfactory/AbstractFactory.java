package com.examples.abstractfactory;

public abstract class AbstractFactory {

    public abstract Animal getAnimal(String type);
    public abstract Color getColor(String type);
}
