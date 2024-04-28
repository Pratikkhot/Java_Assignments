package com.app.fruit;

public class Mango extends Fruit {

    public Mango(String color, double weight) {
        super("Mango", color, weight);
    }

    @Override
    public String taste() {
        return "Sweet";
    }
}
