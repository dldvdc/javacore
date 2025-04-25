package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        checkIfPrimeNumber(55);

    }

    public static boolean isPrimeNumber(int number) {

        for (int divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {

                return false;

            }

        }

        return true;

    }

    public static void checkIfPrimeNumber(int number) {

        if (isPrimeNumber(number)) {

            System.out.println(number + " est un Nombre Premier !");

        }

        else {

            System.out.println(number + " n'est un pas Nombre Premier...");

        }

    }

}



