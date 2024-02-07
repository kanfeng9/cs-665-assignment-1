package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    private Map<Beverage, Integer> map;
    private List<Beverage> beverageList;

    public VendingMachine(List<Beverage> beverages) {
        map = new HashMap<Beverage, Integer>();
        this.beverageList = beverages;
        init();
    }

    private void addBeverage(Beverage b) {
        if (!map.containsKey(b)) {
            System.out.printf("Adding %s to the vending machine\n", b.getName());
            map.put(b, 1);
        } else {
            System.out.printf("%s already exists. Adding another one\n", b.getName());
            map.put(b, map.get(b) + 1);
        }
    }

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

    private void init() {
        for (Beverage b : this.beverageList) {
            addBeverage(b);
        }
        System.out.println("Initialized the vending machine!");
    }

    public void displayMachine() {
        if (map.isEmpty()) {
            System.out.println("Nothing to display.");
            return;
        }
        for (Map.Entry<Beverage, Integer> entry : map.entrySet()) {
            System.out.printf("Beverage: %s | Quantity: %s", entry.getKey().getName(), entry.getValue());
            System.out.println();
        }
    }
}
