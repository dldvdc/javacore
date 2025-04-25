package javacore.chapter04.function.project.refactor;

public class FunctionRefactorArmstrongNumbers {

    public static void main(String[] args) {

            checkIfAmstrongNumber(152);

    }


    public static int getNumberOfDigits(int number) {

        int numberOfDigits = 0;

        for (int i = number ; i > 0; i /= 10) {
            numberOfDigits++;
        }

        return numberOfDigits;

    }


    public static int sumPoweredNumbers(int number, int power) {

        int sumOfPoweredNumber = 0;

        for (int b = number ; b > 0; b /= 10) {

            int isolatedNumber = b % 10;
            int poweredNumber = 1;

            for (int i = 0 ; i < power ; i++) {
                poweredNumber *= isolatedNumber;
            }

            sumOfPoweredNumber += poweredNumber;

        }

        return sumOfPoweredNumber;

    }


    public static boolean checkIfAmstrongNumber(int number) {

        int sumOfPoweredNumber = sumPoweredNumbers(number, getNumberOfDigits(number));

        if ( sumOfPoweredNumber == number ) {
            System.out.println(number + " est un nombre narcissique !");
            return true;

        } else {
            System.out.println(number + " n'est pas un nombre narcissique.");
            return false;
        }

    }

}
