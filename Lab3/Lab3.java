//Elaine Pajarillo
//CMSC 124 DP 
//LAB ACTIVITY 3 - Driver Program

// Private -- can only be accessed inside the class it is in
// Protected -- can only be accessed in the same package

// Base Class Vehicle
class Vehicle {
    protected String type;

    //setter
    public Vehicle(String type) {
        this.type = type;
    }

    //getter
    public void displayType() {
        System.out.println("This is a " + type + ".");
    }
}


// Derived Class Airplane
class Airplane extends Vehicle {
    private String airline;

    public Airplane(String airline) {
        super("Airplane");
        this.airline = airline;
    }

    public void displayAirline() {
        System.out.println("By the " + airline);
    }
}


// Derived Class Boat
class Boat extends Vehicle {
    private int capacity;

    public Boat(int capacity) {
        super("Boat");
        this.capacity = capacity;
    }

    public void displayCapacity() {
        System.out.println("Can carry: " + capacity + " passengers.");
    }
}


// Derived Class Car
class Car extends Vehicle {
    private String model;

    public Car(String model) {
        super("Car");
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}
//Vehicle -- Car, Boat, Airplane


// Derived Class Ferry (inherits from Boat)
class Ferry extends Boat {
    private String routes;

    public Ferry(int capacity, String routes) {
        super(capacity);
        this.routes = routes;
    }

    public void displayRoutes() {
        System.out.println("Routes: " + routes);
    }
}
//Boat -- Ferry

// Derived Class Bus (inherits from Car)
class Bus extends Car {
    private String routeNumber;

    public Bus(String model, String routeNumber) {
        super(model);
        this.routeNumber = routeNumber;
    }

    public void displayRouteNumber() {
        System.out.println("Route Name: " + routeNumber);
    }
}


// Derived Class Jeepney (inherits from Car)
class Jeepney extends Car {
    private double fare;

    public Jeepney(String model, double fare) {
        super(model);
        this.fare = fare;
    }

    public void displayFare() {
        System.out.println("Minimum Fare: " + fare);
    }
}
//Car - bus, jeep 


// Main body
public class Lab3 {
    public static void main(String[] args) {
        // Creating an airplane object
        System.out.println("");
        Airplane airplane = new Airplane("Philippine Airlines");
        airplane.displayType();
        airplane.displayAirline();


        // Creating a ferry object
        System.out.println("");
        Ferry ferry = new Ferry(300, "Thousand Islands");
        ferry.displayType();
        ferry.displayCapacity();
        ferry.displayRoutes();

        // Creating a bus object
        System.out.println("");
        Bus bus = new Bus("Ferrari", "Route Nagasaki");
        bus.displayType();
        bus.displayModel();
        bus.displayRouteNumber();

        // Creating a jeepney object
        System.out.println("");
        Jeepney jeepney = new Jeepney("Modern Jeepney", 12.5);
        jeepney.displayType();
        jeepney.displayModel();
        jeepney.displayFare();
    }
}
