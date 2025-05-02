package javacore.chapter04.function.project.refactor;

public class FunctionRefactorArmstrongNumbers {

    public static void main(String[] args) {

            int number = 152;

            boolean isAmstrongNumber = isAmstrongNumber(number);

            if (isAmstrongNumber) {
                System.out.println(number + " est un nombre narcissique !");
            }
            else {
                System.out.println(number + " n'est pas un nombre narcissique.");
            }

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


    public static boolean isAmstrongNumber(int potentialAmstrongNumber) {

        int numberOfDigit = getNumberOfDigits(potentialAmstrongNumber);

        int sumOfPoweredNumber = sumPoweredNumbers(potentialAmstrongNumber, numberOfDigit);

        return sumOfPoweredNumber == potentialAmstrongNumber;

    }

}
