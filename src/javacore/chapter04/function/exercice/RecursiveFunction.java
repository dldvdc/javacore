package javacore.chapter04.function.exercice;

public class RecursiveFunction {

    public static void main(String[] args) {

        displayNumbers(1, 10000);

    }

    public static void displayNumbers(int currentNumber, int maxNumber) {

        System.out.println(currentNumber);

        if (currentNumber < maxNumber) {

            currentNumber++;

            displayNumbers(currentNumber, maxNumber);

        }

    }

}
