package com.examples.builder;

public class BuilderPatternTest {

    public static void main(String[] args) {
        OutfitGenerator outfitGenerator = new OutfitGenerator();

        System.out.println();
        System.out.println("--------Womens--------");
        Outfit womens = outfitGenerator.generateWomensOutfit();
        womens.showItems();
        System.out.println("Total cost: " + womens.getTotalPrice());

        System.out.println();
        System.out.println("---------Mens---------");
        Outfit mens = outfitGenerator.generateMensOutfit();
        mens.showItems();
        System.out.println("Total cost: " + mens.getTotalPrice());
    }
}
