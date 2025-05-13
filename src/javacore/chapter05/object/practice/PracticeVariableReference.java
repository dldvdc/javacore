package javacore.chapter05.object.practice;

public class PracticeVariableReference {

    public static void main(String[] args) {

        /**
         *  Exemple avec variables primitives
         */

        int age1 = 30;
        int age2 = age1;

        System.out.println("Première valeur de age1 : " + age1);
        System.out.println("Première valeur de age2 : " + age2);

        age2 = 35;
        System.out.println("Seconde valeur de age1 : " + age1);
        System.out.println("Seconde valeur de age2 : " + age2);

        displayAge(age2);

        System.out.println("Troisième valeur de age2 : " + age2);


        /**
         *  Exemple avec variables références
         */

        PracticeObjectCar car1 = new PracticeObjectCar(
                "54GV645X",
                "Fiat",
                "500",
                "white",
                6500);

        PracticeObjectCar car2 = car1;

        System.out.println("Première valeur référence de car1 : " + car1);
        System.out.println("Première valeur référence de car2 : " + car2);

        System.out.println("Première valeur de kilométrage de car1 : " + car1.odometer);
        System.out.println("Première valeur de kilométrage de car2 : " + car2.odometer);

        car2.odometer = 30;

        System.out.println("Seconde valeur de kilométrage de car1 : " + car1.odometer);
        System.out.println("Seconde valeur de kilométrage de car2 : " + car2.odometer);

        displayCar(car2);

        System.out.println("Troisième valeur de kilométrage de car2 : " + car2.odometer);
        System.out.println("Seconde valeur référence de car1 : " + car1);
        System.out.println("Seconde valeur référence de car2 : " + car2);

        car1 = new PracticeObjectCar(
                "54GV645X",
                "Fiat",
                "500",
                "white",
                6500);

        car2 = new PracticeObjectCar(
                "54GV645X",
                "Fiat",
                "500",
                "white",
                6500);

        System.out.println("Troisième valeur référence de car1 : " + car1);
        System.out.println("Troisième valeur référence de car2 : " + car2);
        System.out.println("Quatrième valeur de kilométrage de car1 : " + car1.odometer);
        System.out.println("Quatrième valeur de kilométrage de car2 : " + car2.odometer);

        car2.odometer += 5000;

        System.out.println("Cinquième valeur de kilométrage de car1 : " + car1.odometer);
        System.out.println("Cinquième valeur de kilométrage de car2 : " + car2.odometer);

        displayCar(car2);

        System.out.println("Sixième valeur de kilométrage de car1 : " + car1.odometer);
        System.out.println("Sixième valeur de kilométrage de car2 : " + car2.odometer);

    }

    public static void displayAge(int age) {

        age = 40;
        System.out.println("Age : " + age);

    }

    public static void displayCar(PracticeObjectCar car) {

        car.odometer = 1000;
        System.out.println("Valeur de kilométrage de car : " + car.odometer);
        System.out.println("Valeur référence de car : " + car);

    }

}
