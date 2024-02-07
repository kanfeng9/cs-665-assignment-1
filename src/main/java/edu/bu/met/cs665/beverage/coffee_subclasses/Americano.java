package edu.bu.met.cs665.beverage.coffee_subclasses;

import edu.bu.met.cs665.beverage.Coffee;

public class Americano extends Coffee {
    private final int brewTime = 30;

    public Americano(String n, int s) {
        super(n, s);
    }

    public int getBrewTime() {
        return this.brewTime;
    }
}
