| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Zhiling Li                 |
| Date         | 02/07/2024                 |
| Course       | Spring                     |
| Assignment # | 1                          |

# Assignment Overview

The primary objective of this assignment was to design and implement a software application capable of controlling a
fully automated beverage vending machine. The challenge was to create a versatile system that not only facilitates the
selection and dispensing of various types of beverages, including coffee and tea, but also allows for the customization
of these beverages with condiments such as milk and sugar. A significant emphasis was placed on applying sound software
design principles to ensure the application's flexibility, maintainability, and ease of use.

To achieve these goals, I employed object-oriented programming techniques, focusing on abstraction, inheritance, and
polymorphism, to create a scalable and extensible architecture. The application was designed to be open to future
expansions, such as the introduction of new beverage types or condiments, without necessitating substantial
modifications to the existing codebase. Furthermore, the project involved developing a suite of unit tests to rigorously
verify the functionality of the system under various scenarios, ensuring reliability and robustness. Through this
assignment, I aimed to demonstrate a thorough understanding of software design patterns and principles, as well as my
ability to apply these concepts in a practical, real-world application.

# GitHub Repository Link:

https://github.com/kanfeng9/cs-665-assignment-1

# Implementation Description

## Overview

This document outlines the design and implementation strategies I employed in developing the Automated Beverage Vending
Machine application. The application supports a variety of beverages, including coffee and tea, and enables users to
customize their drinks with condiments.

## Design Principles

### Flexibility

In my implementation, I leveraged **inheritance** and **polymorphism** to facilitate the easy introduction of new
beverage types. By creating a base `Beverage` class from which `Coffee` and `Tea` classes are derived, I ensured that
adding a new drink type, such as `Latte`, is as straightforward as extending `Coffee` and providing implementations for
any abstract methods like `getBrewTime()`. This design adheres to the **Open/Closed Principle**, allowing the system to
be open for extension but closed for modification.

### Simplicity and Understandability

I organized the application into distinct, focused classes, each responsible for a specific aspect of the system's
functionality. The `VendingMachine` class manages beverage dispensing and inventory, while `Beverage` and its subclasses
concentrate on beverage-specific details. Through descriptive naming conventions and comprehensive comments, I aimed to
enhance the readability and maintainability of the codebase.

### DRY Principle (Don't Repeat Yourself)

To minimize code duplication, I utilized abstract classes and inheritance. Shared properties and behaviors are
encapsulated in the `Beverage` class and inherited by `Coffee`, `Tea`, and any other beverage subclasses. This approach
promotes code reuse and simplifies updates to shared functionalities across beverages.

### Design Patterns

- **Abstract Factory Pattern** (Conceptual): Although not explicitly implemented, the setup of my beverage creation
  logic aligns with the Abstract Factory Pattern. This pattern would facilitate the instantiation of various beverage
  types through a single interface, further decoupling system components and enhancing scalability.

## Challenges and Solutions

- **Condiment Management**: Implementing the functionality to allow condiment additions while enforcing limits was
  challenging. I addressed this by integrating a method in the `Beverage` class for managing condiments, ensuring that
  additions stay within the predefined limits.

- **Testing**: Developing comprehensive tests to cover a range of scenarios, including condiment additions and beverage
  retrieval, required thoughtful consideration. My testing strategy focused on verifying the application's behavior
  under normal conditions and edge cases, such as exceeding condiment limits.

## Conclusion

The Automated Beverage Vending Machine application is designed with principles of flexibility, simplicity, and
maintainability at its core. By employing key software design principles and considering future extension possibilities,
I've created a robust and user-friendly system ready to adapt to new requirements or beverage types.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/)
on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a
standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains
information about the project, such as its dependencies, the build configuration, and the plugins used for building and
packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the
dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that
builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to
use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports,
and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the
behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is
annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the
code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and
easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code
they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all
required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time
changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for
manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool
that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems
or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and
other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately
obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to
meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the
development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues
later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential
security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source
tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as
well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on
any issues or violations of the coding standards defined in its configuration. This includes issues like code style,
code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices,
making it easier for other developers to read and maintain. It can also help to identify potential issues before the
code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a
wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing
tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




