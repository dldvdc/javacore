package javacore.chapter04.function.exercice;

public class FunctionOverload {

    public static void main(String[] args) {

        System.out.println(sum(2, 6));

    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return sum(number1, number2) + number3;
    }
}
