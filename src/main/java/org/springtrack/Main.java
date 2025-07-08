package org.springtrack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder();
        Scanner inputReader = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("1. Add Order");
            System.out.println("2. Update Order");
            System.out.println("3. Remove Order");
            System.out.println("4. View Order");
            System.out.println("5. Exit");
            System.out.print("Choose Option: ");
            choice = inputReader.nextInt();
            //add new line
            //to remove later for commit
            System.out.println();

            int quantity = 0;
            int index = 0;

            switch (choice) {
                case 1:
                    System.out.print("Pizza Type: ");
                    String pizzaType = inputReader.next();
                    System.out.print("Quantity: ");
                    quantity = inputReader.nextInt();

                    if (quantity > 0) {
                        pizzaOrder.addOrder(pizzaType, quantity);
                    } else {
                        System.out.println("Enter a number greater than 0 for quantity");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Order Number to Update: ");
                    index = inputReader.nextInt();
                    System.out.print("New Quantity: ");
                    quantity = inputReader.nextInt();

                    pizzaOrder.updateOrder(index, quantity);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Order Number to Remove: ");
                    index = inputReader.nextInt();
                    pizzaOrder.removeOrder(index);

                    System.out.println();
                    break;

                case 4:
                    pizzaOrder.printOrders();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("---Thank You---");
                    System.out.println();
                    break;

                default:
                    System.out.println("Wrong Input, try again!");
            }

        }
    }
}