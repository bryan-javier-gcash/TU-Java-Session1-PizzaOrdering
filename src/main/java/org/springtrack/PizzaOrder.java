package org.springtrack;

import java.util.ArrayList;

public class PizzaOrder {
    private ArrayList<String> pizzas;
    private ArrayList<Integer> quantities;


    public PizzaOrder() {
        this.pizzas = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addOrder(String pizzaType, int quantity) {

        if (pizzas.isEmpty()) {
            pizzas.add(pizzaType);
            quantities.add(quantity);
        } else {
            boolean isPizzaExisting = false;

            for (String pizza: pizzas) {
                if (pizza.equals(pizzaType)){
                    isPizzaExisting = true;
                    quantities.set(pizzas.indexOf(pizza), quantities.get(pizzas.indexOf(pizza)) + quantity);
                }
            }

            if (!isPizzaExisting) {
                pizzas.add(pizzaType);
                quantities.add(quantity);
            }
        }
    }

    public void updateOrder(int index, int newQuantity){
        quantities.set(index - 1, newQuantity);
    }

    public void removeOrder(int index) {
        pizzas.remove(index - 1);
        quantities.remove(index - 1);
    }

    public void printOrders() {
        System.out.println("----- Current Orders ------");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + pizzas.get(i) + " x " + quantities.get(i));
        }

        System.out.println("---------------------------");
    }
}
