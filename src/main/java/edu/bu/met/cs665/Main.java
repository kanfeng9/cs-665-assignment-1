package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee_subclasses.Americano;
import edu.bu.met.cs665.beverage.coffee_subclasses.Espresso;
import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);


    /**
     * A main method to run examples.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        // This configuration is for setting up the log4j properties file.
        // It is better to set this using java program arguments.
        PropertyConfigurator.configure("log4j.properties");

        // Let us create an object of the Main class.
        Main m = new Main();

        logger.info(m.doIt());

        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");

        List<Beverage> beverageList = new ArrayList<Beverage>();
        Beverage espresso = new Espresso("Espresso", 2);
        Beverage americano = new Americano("Americano", 2);
        Beverage esp2 = new Espresso("Espresso", 2);
        beverageList.add(espresso);
        beverageList.add(americano);
        beverageList.add(esp2);

        VendingMachine machine = new VendingMachine(beverageList);
        machine.displayMachine();

    }


    private String doIt() {
        Person student = new Person("John", "Doe");
        return student.getLastName() + ',' + student.getLastName();
    }

}
