/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classinheritanceassignment;

/**
 *
 * @author SChang2026
 */
/*
 * Base Vehicle class - Represents a generic vehicle
 */

// Vehicle.java
// Base class representing a generic vehicle.
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Returns a string representation of the vehicle
    public String toString() {
        return year + " " + make + " " + model;
    }
}

// Car.java
// Inherits from Vehicle, representing a car.
class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    // Override toString() for better display.
    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}

// SportsCar.java
// Inherits from Car and represents a high-performance sports car.
class SportsCar extends Car {
    private double zeroToSixty; // Time in seconds to reach 60 MPH
    private double topSpeed;    // Top speed in MPH

    public SportsCar(String make, String model, int year, double zeroToSixty, double topSpeed) {
        super(make, model, year);
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " | 0-60 MPH: " + zeroToSixty + " sec | Top Speed: " + topSpeed + " MPH";
    }
}

// ElectricCar.java
// Inherits from Car and represents an electric vehicle.
class ElectricCar extends Car {
    private double batteryCapacity; // Battery in kWh
    private double range;           // Range in miles

    public ElectricCar(String make, String model, int year, double batteryCapacity, double range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    @Override
    public String toString() {
        return super.toString() + " | Battery: " + batteryCapacity + " kWh | Range: " + range + " miles";
    }
}

// Boat.java
// Inherits from Vehicle, representing a boat.
class Boat extends Vehicle {
    public Boat(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public String toString() {
        return "Boat: " + super.toString();
    }
}

// Sailboat.java
// Inherits from Boat and represents a sailboat.
class Sailboat extends Boat {
    private double sailArea; // Sail area in square feet

    public Sailboat(String make, String model, int year, double sailArea) {
        super(make, model, year);
        this.sailArea = sailArea;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sail Area: " + sailArea + " sq ft";
    }
}

// Motorboat.java
// Inherits from Boat and represents a motorboat.
class Motorboat extends Boat {
    private double enginePower; // Engine power in HP

    public Motorboat(String make, String model, int year, double enginePower) {
        super(make, model, year);
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return super.toString() + " | Engine Power: " + enginePower + " HP";
    }
}

// Airplane.java
// Inherits from Vehicle, representing an airplane.
class Airplane extends Vehicle {
    public Airplane(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public String toString() {
        return "Airplane: " + super.toString();
    }
}

// Jet.java
// Inherits from Airplane and represents a jet.
class Jet extends Airplane {
    private double maxAltitude; // Max altitude in feet
    private double topSpeed;    // Top speed in MPH

    public Jet(String make, String model, int year, double maxAltitude, double topSpeed) {
        super(make, model, year);
        this.maxAltitude = maxAltitude;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " | Max Altitude: " + maxAltitude + " ft | Top Speed: " + topSpeed + " MPH";
    }
}

// PropellerPlane.java
// Inherits from Airplane and represents a propeller-driven airplane.
class PropellerPlane extends Airplane {
    private int numEngines; // Number of engines

    public PropellerPlane(String make, String model, int year, int numEngines) {
        super(make, model, year);
        this.numEngines = numEngines;
    }

    @Override
    public String toString() {
        return super.toString() + " | Engines: " + numEngines;
    }
}

// Hovercraft.java
// Unique vehicle class that can travel on water and land.
class Hovercraft extends Vehicle {
    private double maxSpeed; // Max speed in MPH

    public Hovercraft(String make, String model, int year, double maxSpeed) {
        super(make, model, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Hovercraft: " + super.toString() + " | Max Speed: " + maxSpeed + " MPH";
    }
}

// Submarine.java
// Unique vehicle class that operates underwater.
class Submarine extends Vehicle {
    private double maxDepth; // Maximum depth in feet

    public Submarine(String make, String model, int year, double maxDepth) {
        super(make, model, year);
        this.maxDepth = maxDepth;
    }

    @Override
    public String toString() {
        return "Submarine: " + super.toString() + " | Max Depth: " + maxDepth + " ft";
    }
}

// Main class to test the vehicles
public class ClassInheritanceAssignment {
    public static void main(String[] args) {
        // Create various vehicle objects
        SportsCar ferrari = new SportsCar("Ferrari", "F8", 2022, 2.9, 211);
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2023, 100, 396);

        Sailboat sailboat = new Sailboat("Beneteau", "Oceanis", 2019, 750);
        Motorboat motorboat = new Motorboat("Yamaha", "212X", 2021, 500);

        Jet fighterJet = new Jet("Lockheed", "F-22 Raptor", 2022, 50000, 1500);
        PropellerPlane cessna = new PropellerPlane("Cessna", "172", 2018, 1);

        Hovercraft hovercraft = new Hovercraft("Griffon", "2000TD", 2020, 50);
        Submarine submarine = new Submarine("Seawolf", "SSN-21", 2015, 1600);

        // Print out details of each vehicle
        System.out.println(ferrari);
        System.out.println(tesla);
        System.out.println(sailboat);
        System.out.println(motorboat);
        System.out.println(fighterJet);
        System.out.println(cessna);
        System.out.println(hovercraft);
        System.out.println(submarine);
    }
}
