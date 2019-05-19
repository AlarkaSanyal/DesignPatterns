package com.examples.abstractfactory;

public class AnimalFactory extends AbstractFactory{

    @Override
    public Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
