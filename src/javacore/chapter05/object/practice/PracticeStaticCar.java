package javacore.chapter05.object.practice;

public class PracticeStaticCar {


    static int carCounter = 0;

    String brand;
    String model;
    double price;


    public PracticeStaticCar(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;

        PracticeStaticCar.carCounter++;

    }

}
