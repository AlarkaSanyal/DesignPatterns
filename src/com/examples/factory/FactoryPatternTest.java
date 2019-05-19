package com.examples.factory;

public class FactoryPatternTest {

    public static void main(String[] args) {

        // Create an instance of the factory class
        ColorFactory colorFactory = new ColorFactory();

        // For drawing with Red color
        Color red = colorFactory.getColor("red");
        red.draw(); // Should draw with Red color

        // For drawing with Blue color
        Color blue = colorFactory.getColor("blue");
        blue.draw(); // Should draw with Blue color

        // For drawing with Green color
        Color green = colorFactory.getColor("green");
        green.draw(); // Should draw with Green color
    }
}
