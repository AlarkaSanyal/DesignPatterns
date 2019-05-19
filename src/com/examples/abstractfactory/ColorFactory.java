package com.examples.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String type) {
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        } else if (type.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (type.equalsIgnoreCase("yellow")) {
            return new Yellow();
        }
        return null;
    }

    @Override
    public Animal getAnimal(String type) {
        return null;
    }
}
