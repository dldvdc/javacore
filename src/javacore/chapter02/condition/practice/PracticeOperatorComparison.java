package javacore.chapter02.condition.practice;

public class PracticeOperatorComparison {

    public static void main(String[] args) {

        int a = 30;
        int b = 30;

        boolean isEqual = a == b;
        System.out.println("Est-ce-que " + a + " et " + b + " sont egaux ? : " + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Est-ce-que " + a + " et " + b + " sont differents ? : " + isNotEqual);

        boolean isLessThan = a < b;
        System.out.println("Est-ce-que " + a + " est plus petit que " + b + " ? : " + isLessThan);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Est-ce-que " + a + " est plus petit ou egal a " + b + " ? : " + isLessThanOrEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Est-ce-que " + a + " est plus grand que " + b + " ? : " + isGreaterThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Est-ce-que " + a + " est plus grand ou egal a " + b + " ? : " + isGreaterThanOrEqual);

    }

}
