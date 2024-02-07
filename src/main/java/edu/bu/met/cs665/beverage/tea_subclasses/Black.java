package edu.bu.met.cs665.beverage.tea_subclasses;

import edu.bu.met.cs665.beverage.Tea;

public class Black extends Tea {
    // Seconds
    private final int brewTime = 120;

    public Black(String n, int s) {
        super(n, s);
    }

    public int getBrewTime() {
        return this.brewTime;
    }
}
