package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee_subclasses.Americano;
import edu.bu.met.cs665.beverage.coffee_subclasses.Espresso;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // Configure logging
        PropertyConfigurator.configure("log4j.properties");

        // Initialize and populate the vending machine
        List<Beverage> beverageList = new ArrayList<>();
        beverageList.add(new Espresso("Espresso", 2));
        beverageList.add(new Americano("Americano", 2));
        beverageList.add(new Espresso("Espresso", 2)); // Example of adding another espresso

        VendingMachine machine = new VendingMachine(beverageList);
        logger.info("Vending Machine initialized with beverages.");
        machine.displayMachine();
    }
}
