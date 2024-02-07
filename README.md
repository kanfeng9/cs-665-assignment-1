# Project Template

This is a Java Maven Project Template

# How to compile the project

We use Apache Maven to compile and run this project.

You need to install Apache Maven (https://maven.apache.org/)  on your system.

Type on the command line:

```bash
mvn clean compile
```

# How to create a binary runnable package

```bash
mvn clean compile assembly:single
```

# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project.

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies.

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

# Using Findbugs

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using

```bash
mvn findbugs:gui 
```

or

```bash
mvn findbugs:findbugs
```

For more info about FindBugs see

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see
https://gleclaire.github.io/findbugs-maven-plugin/index.html

You can install Findbugs Eclipse Plugin

http://findbugs.sourceforge.net/manual/eclipse.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

# Run Checkstyle

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code
style.
You can change it to other styles like sun checkstyle.

To analyze this example using CheckStyle run

```bash
mvn checkstyle:check
```

This will generate a report in XML format

```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser.

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```

# Generate  coveralls:report

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```

# Implementation Description

```
This program acts as a program controller for a vending machine.
This vending machine can take any type of Beverage object (teas, coffee, sodas, etc).
Once a List<Beverage> is initialized with desired beverages, the vending machine can be initialized.

The Vending Machine uses a Map<Beverage, Integer> to store beverages that exist, and their quantity.
Via this underlying data stucture, we can remove and add beverages as we please while
taking into account the current state via its quantity.

The vending machine can support different types of beverages, 
as long as the future beverage object extends from the base super Beverage class.

The program is run from the main method. First a list of beverage objects must be created and passed
into the VendingMachine constructor. The machine will then initialize and prompt the user
to type in the name of the beverage desired. 

If the user would like to add future drink types not related to coffee or tea, the user should create 
a new subclass for the desired drink type. 
```


