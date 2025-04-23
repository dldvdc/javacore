package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        int number = 465;

        if (isPrimeNumber(number)) {
            System.out.println(number + " est un Nombre Premier !");
        }
        else {
            System.out.println(number + " n'est un pas Nombre Premierr...");
        }

    }

    public static boolean isPrimeNumber(int number) {

        for (int divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {
                return false;
            }

        }
        return true;
    }

}



