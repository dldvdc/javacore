package javacore.chapter03.loop.exercise;

public class SmallestDivisorFinder {

    public static void main(String[] args) {

        // 1, 4, 5, 9, 12, 35, 563, 443
        int number = 563;

        int divisor = 2;


        while ( number % divisor != 0 ) {
            divisor++;
        }

        System.out.println("\nLe plus petit diviseur de " + number + " est " + divisor);

        if (divisor == number) {
            System.out.println("C'est un nombre premier !");
        }

    }

}
