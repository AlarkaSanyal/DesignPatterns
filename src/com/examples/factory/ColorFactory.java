package com.examples.factory;

public class ColorFactory {

    public Color getColor(String type) {
        if (type.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (type.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (type.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
