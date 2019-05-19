package com.examples.builder;

public class OutfitGenerator {

    public Outfit generateMensOutfit() {
        Outfit outfit = new Outfit();
        outfit.addItem(new Shirt());
        outfit.addItem(new Trouser());
        return outfit;
    }

    public Outfit generateWomensOutfit() {
        Outfit outfit = new Outfit();
        outfit.addItem(new Racerback());
        outfit.addItem(new Skirt());
        return outfit;
    }
}
