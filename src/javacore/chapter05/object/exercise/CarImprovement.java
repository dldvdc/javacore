package javacore.chapter05.object.exercise;

import javacore.chapter05.object.practice.PracticeObjectCar;

public class CarImprovement {

    // 1
    String serialNumber;

    String brand;
    String model;
    String color;
    double price;

    double odometer;
    boolean isEngineStarted;

    // 2
    public CarImprovement(String serialNumber, String brand, String model, String color, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;

        // A la construction, dans ce contexte, il est logique que le moteur soit à l'arrêt -> false
        this.isEngineStarted = false;
        // La responsabilité de le démarrer appartiendra aux méthodes qui le nécessiteront -> true

        this.displayInformation();

    }


    // 3
    public void startEngine() {
        if (!isEngineStarted) {
            isEngineStarted = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }


    public void stopEngine() {
        if (isEngineStarted) {
            isEngineStarted = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    // 4
    public double run(double distance) {

        if (!isEngineStarted) {
            System.out.println("Engine not started. Please start the engine before run");
            return 0;
        }

        System.out.println("This car is running " + distance + " km.");
        odometer += distance;

        return distance;

    }


    public void displayInformation() {
        System.out.println("\nSerial Number : " + this.serialNumber
                + " | Brand : " + this.brand
                + " | Model : " + this.model
                + " | Color : " + this.color
                + " | Kms : " + this.odometer + " kms"
                + " | Engine running: " + isEngineStarted + "\n");
    }


    // 5 - Test
    public static void main(String[] args) {

        CarImprovement car001 = new CarImprovement(
                "54GV645X",
                "Fiat",
                "500",
                "white",
                6500);

        car001.startEngine();
        car001.run(30);
        car001.stopEngine();
        car001.displayInformation();

    }

}
