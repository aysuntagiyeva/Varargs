package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        fruitList("orange", "cherry", "ananas");
        vegetablesList("potato", "corn", "pepper");

    }

    public static void fruitList(String... names) {
        for (String n : names) {
            System.out.println("Fruit name is: " + n);
        }
    }

    public static void vegetablesList(String... names) {
        for (String n : names) {
            System.out.println("Vegetable name is: " + n);
        }
    }
}
