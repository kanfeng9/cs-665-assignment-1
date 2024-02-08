package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee_subclasses.Americano;
import edu.bu.met.cs665.beverage.coffee_subclasses.Espresso;
import edu.bu.met.cs665.beverage.coffee_subclasses.Latte;
import edu.bu.met.cs665.beverage.tea_subclasses.Black;
import edu.bu.met.cs665.beverage.tea_subclasses.Green;
import edu.bu.met.cs665.beverage.tea_subclasses.Yellow;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // Configure logging
        PropertyConfigurator.configure("log4j.properties");

        Scanner scanner = new Scanner(System.in);
        List<Beverage> beverageList = new ArrayList<>();

        System.out.println("Welcome to the Automated Beverage Vending Machine.");
        boolean addingBeverages = true;

        while (addingBeverages) {
            System.out.println("Enter the type of beverage to add ('Espresso', 'Americano', 'Latte', 'Green Tea', 'Black Tea', 'Yellow Tea'): ");
            String beverageType = scanner.nextLine();

            System.out.println("Enter the size (1 for small, 2 for medium, 3 for large): ");
            int size = Integer.parseInt(scanner.nextLine()); // Consider adding error handling for non-integer input

            switch (beverageType.toLowerCase()) {
                case "espresso":
                    beverageList.add(new Espresso("Espresso", size));
                    break;
                case "americano":
                    beverageList.add(new Americano("Americano", size));
                    break;
                case "latte":
                    beverageList.add(new Latte("Latte", size));
                    break;
                case "green tea":
                    beverageList.add(new Green("Green Tea", size));
                    break;
                case "black tea":
                    beverageList.add(new Black("Black Tea", size));
                    break;
                case "yellow tea":
                    beverageList.add(new Yellow("Black Tea", size));
                    break;
                default:
                    System.out.println("Invalid beverage type. Available options are 'Espresso', 'Americano', 'Latte', 'Green Tea', 'Black Tea', 'Yellow Tea'.");
                    continue;
            }

            System.out.println("Do you want to add another beverage? (yes/no): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                addingBeverages = false;
            }
        }

        VendingMachine machine = new VendingMachine(beverageList);
        logger.info("Vending Machine initialized with beverages.");
        machine.displayMachine();

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
