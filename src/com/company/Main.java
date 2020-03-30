package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("orange");
        fruit.add("cherry");
        fruit.add("ananas");

        List<String> vegetable = new ArrayList<>();
        vegetable.add("potato");
        vegetable.add("corn");
        vegetable.add("pepper");

        fruitList(fruit);
        vegetablesList(vegetable);
    }

    public static void fruitList(List<String> names) {
        for (String n : names) {
            System.out.println("Fruit name is: " + n);
        }
    }

    public static void vegetablesList(List<String> names) {
        for (String n : names) {
            System.out.println("Vegetable name is: " + n);
        }
    }
}
