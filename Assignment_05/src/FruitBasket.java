package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {
    private Fruit[] basket;
    private int counter;

    public FruitBasket(int size) {
        basket = new Fruit[size];
        counter = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the fruit basket: ");
        int size = scanner.nextInt();
        FruitBasket fruitBasket = new FruitBasket(size);
        fruitBasket.menu();
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name, color, weight, taste of all fresh fruits in the basket");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of all stale fruits in the basket");
            System.out.println("8. Mark all sour fruits stale");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    addMango();
                    break;
                case 2:
                    addOrange();
                    break;
                case 3:
                    addApple();
                    break;
                case 4:
                    displayNames();
                    break;
                case 5:
                    displayFreshFruits();
                    break;
                case 6:
                    markStale();
                    break;
                case 7:
                    displayStaleTastes();
                    break;
                case 8:
                    markSourStale();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private void addMango() {
        if (counter < basket.length) {
            basket[counter++] = new Mango("Yellow", 0.3);
            System.out.println("Mango added successfully!");
        } else {
            System.out.println("Basket is full!");
        }
    }

    private void addOrange() {
        if (counter < basket.length) {
            basket[counter++] = new Orange("Orange", 0.4);
            System.out.println("Orange added successfully!");
        } else {
            System.out.println("Basket is full!");
        }
    }

    private void addApple() {
        if (counter < basket.length) {
            basket[counter++] = new Apple("Red", 0.2);
            System.out.println("Apple added successfully!");
        } else {
            System.out.println("Basket is full!");
        }
    }

    private void displayNames() {
        System.out.println("Names of fruits in the basket:");
        for (int i = 0; i < counter; i++) {
            System.out.println(basket[i].getName());
        }
    }

    private void displayFreshFruits() {
        System.out.println("Details of fresh fruits in the basket:");
        for (int i = 0; i < counter; i++) {
            if (basket[i].isFresh()) {
                System.out.println("Name: " + basket[i].getName() + ", Color: " + basket[i].color + ", Weight: " + basket[i].weight + ", Taste: " + basket[i].taste());
            }
        }
    }

    private void markStale() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of fruit to mark as stale: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < counter) {
            basket[index].setFresh(false);
            System.out.println("Fruit marked as stale.");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private void displayStaleTastes() {
        System.out.println("Tastes of stale fruits in the basket:");
        for (int i = 0; i < counter; i++) {
            if (!basket[i].isFresh()) {
                System.out.println(basket[i].taste());
            }
        }
    }

    private void markSourStale() {
        for (int i = 0; i < counter; i++) {
            if (basket[i] instanceof Orange || (basket[i] instanceof Apple && basket[i].taste().equals("Sour"))) {
                basket[i].setFresh(false);
            }
        }
        System.out.println("All sour fruits marked as stale.");
    }
}
