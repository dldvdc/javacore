package javacore.chapter04.function.practice;

public class PracticeFunctionReturn {

    public static void main(String[] args) {

        displaySum(sum(25, 30));

    }

    public static int sum(int number1, int number2) {

        return number1 + number2;

    }

    public static void displaySum(int sum) {

        System.out.println(sum);

    }

}
