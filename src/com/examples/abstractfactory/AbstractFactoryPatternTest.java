package com.examples.abstractfactory;

public class AbstractFactoryPatternTest {

    public static void main(String[] args) {

        // Get Color factory
        AbstractFactory colorFactory = FactoryGenerator.getFactory("color");

        // Red
        Color red = colorFactory.getColor("red");
        red.draw(); // Should draw with Red color

        // Blue
        Color blue = colorFactory.getColor("blue");
        blue.draw(); // Should draw with Blue color

        // Yellow
        Color yellow = colorFactory.getColor("yellow");
        yellow.draw(); // Should draw with Yellow color

        // Get Animal factory
        AbstractFactory animalFactory = FactoryGenerator.getFactory("animal");

        // Dog
        Animal dog = animalFactory.getAnimal("dog");
        dog.sound(); // Should bark

        // Cat
        Animal cat = animalFactory.getAnimal("cat");
        cat.sound(); // Should meow
    }
}
