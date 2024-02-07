package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    // Map to store beverages and their quantities in the vending machine
    private final Map<Beverage, Integer> map;
    // List of beverages to be added to the vending machine
    private final List<Beverage> beverageList;

    // Constructor initializes the vending machine with a list of beverages
    public VendingMachine(List<Beverage> beverages) {
        map = new HashMap<Beverage, Integer>();
        this.beverageList = beverages;
        init(); // Initialize the machine with the provided beverages
    }

    // Adds a beverage to the machine, or increases its quantity if it already exists
    private void addBeverage(Beverage b) {
        if (!map.containsKey(b)) {
            System.out.printf("Adding %s to the vending machine\n", b.getName());
            map.put(b, 1);
        } else {
            System.out.printf("%s already exists. Adding another one\n", b.getName());
            map.put(b, map.get(b) + 1);
        }
    }

    // Retrieves a beverage from the machine, or returns null if it's not available or out of stock
    public Beverage getBeverage(Beverage b) {
        if (!map.containsKey(b)) {
            System.out.println("This beverage doesn't exist in the vending machine");
            return null;
        } else if (map.get(b) == 0) {
            System.out.printf("Zero %s remaining. Removing from the vending machine", b.getName());
            map.remove(b);
            return null;
        } else {
            System.out.printf("Removing 1 %s from the vending machine", b.getName());
            map.put(b, map.get(b) - 1);
        }
        return b;
    }

    // Initializes the vending machine with the beverages in the beverageList
    private void init() {
        for (Beverage b : this.beverageList) {
            addBeverage(b);
        }
        System.out.println("Initialized the vending machine!");
    }

    // Displays the beverages and their quantities in the vending machine
    public void displayMachine() {
        if (map.isEmpty()) {
            System.out.println("Nothing to display.");
            return;
        }
        for (Map.Entry<Beverage, Integer> entry : map.entrySet()) {
            System.out.printf("Beverage: %s | Quantity: %s\n", entry.getKey().getName(), entry.getValue());
        }
    }
}
