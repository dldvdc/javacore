package javacore.chapter04.function.exercice;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        checkIfPrimeNumber(5);

    }

    public static boolean isPrimeNumber(int potentialPrimeNumber) {

        for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

            if (potentialPrimeNumber % potentialDivisor == 0) {
                return false;
            }

        }
        return true;

    }

    public static void checkIfPrimeNumber(int potentialPrimeNumber) {

        if (isPrimeNumber(potentialPrimeNumber)) {
            System.out.println(potentialPrimeNumber + " est un Nombre Premier !");
        }

        else {
            System.out.println(potentialPrimeNumber + " n'est un pas Nombre Premier...");
        }

    }

}



