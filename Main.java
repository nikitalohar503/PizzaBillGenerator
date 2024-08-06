package com.beginsjava;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizza basePizza = new Pizza(false);
//        basePizza.getPizzaprice();
        basePizza.addExtraToppings();

        basePizza.getBill();
    }
}
