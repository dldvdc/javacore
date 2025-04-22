package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        int number = 153;
        int power = 0;

        for ( int a = 1 ; number - a > 0 ; a *= 10) {
            power++;
        }

        int result = 0;

        for (int b = number ; b > 0; b /= 10) {

            int digit = b % 10;

            for (int i = 0; i < power; i++) {
                result *= digit;
            }

        }

        System.out.println(result);

        if ( result == number ) {
            System.out.println(number + " est un nombre narcissique !");
        }

    }

}
