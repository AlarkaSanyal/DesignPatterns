# DesignPatterns

## A. Creational Pattern

### 1. Factory Pattern

### 2. Abstract Factory Pattern

### 3. Singleton Pattern

### 4. Builder Pattern
Build a Outfit generator for Men and Women considering the following points:
1. An Oufit would consist of two items: a Top and a Bottom
2. A Top can be a Shirt or a Racerback and material would be cotton
3. A Bottom can be a Trouser or a Skirt and material would be leather
4. Each item will have a name and a price

Steps:
1. Build an interface Material
2. Build classes for Cotton and Leather implementing Material
3. Build an interface Item with name, material and price
4. Build abstract classes for Top and Bottom with Tops of cotton and Bottoms of leather
5. Built classes for Shirt, Racerback, Trouser and Skirt extending the abstract classes
6. Build Outfit class which will contain multiple items in an arraylist to create a single Outfit
7. Build an Outfit builder class to build outfits with different combinations for Men and Women