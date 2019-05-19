package com.examples.builder;

import java.util.ArrayList;

public class Outfit {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int getTotalPrice() {
        return items.stream().mapToInt(i -> i.price()).sum();
    }

    public void showItems() {
        items.stream().forEach((i) -> {
            System.out.print(i.name());
            System.out.print(", made of ");
            System.out.print(i.material().getMaterial());
            System.out.print(". Costs: $");
            System.out.println(i.price());
        });
    }
}
