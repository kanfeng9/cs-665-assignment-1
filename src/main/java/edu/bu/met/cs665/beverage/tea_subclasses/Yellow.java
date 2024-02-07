package edu.bu.met.cs665.beverage.tea_subclasses;

import edu.bu.met.cs665.beverage.Tea;

public class Yellow extends Tea {
    private final int brewTime = 120;

    public Yellow(String n, int s) {
        super(n, s);
    }

    public int getBrewTime() {
        return this.brewTime;
    }
}
