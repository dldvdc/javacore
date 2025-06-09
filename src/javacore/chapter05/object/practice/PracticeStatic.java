package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeStatic {

    public static void main(String[] args) {

        PracticeStaticCar car1 = new PracticeStaticCar(
                "Peugeot",
                "206",
                15000);
        PracticeStaticCar car2 = new PracticeStaticCar(
                "Ford",
                "Mustang",
                120000);

        System.out.println("\nNombre de voitures créées : " + PracticeStaticCar.carCounter + "\n");

        Scanner scanner = new Scanner(System.in);

        int a = 3;
        int b = 2;

        System.out.println(a + " + " + b + " = " + PracticeStaticCalculator.sum(a, b ));
        System.out.println(a + " - " + b + " = " + PracticeStaticCalculator.subtract(a, b ) + "\n");

    }

}
