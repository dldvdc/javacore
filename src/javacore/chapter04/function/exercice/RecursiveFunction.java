package javacore.chapter04.function.exercice;

public class RecursiveFunction {

    public static void main(String[] args) {

        displayNumbers(1, 10000);

    }

    public static void displayNumbers(int initialNumber, int endNumber) {

        System.out.println(initialNumber);

        if (initialNumber < endNumber) {

            initialNumber++;

            displayNumbers(initialNumber, endNumber);

        }

    }

}
