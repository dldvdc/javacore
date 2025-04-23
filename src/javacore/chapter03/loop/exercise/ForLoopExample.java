package javacore.chapter03.loop.exercise;

public class ForLoopExample {

    public static void main(String[] args) {


        // 1

        System.out.println("\nBoucle for n° 1");

        for ( int loopCounter = 1 ; loopCounter <= 10 ; loopCounter++) {
            System.out.println(loopCounter);
        }


        System.out.println("\nBoucle for n° 2");

        for ( int loopCounter = 10 ; loopCounter > 0 ; loopCounter--) {
            System.out.println(loopCounter);
        }


        System.out.println("\nBoucle n° 3");

        for ( int loopCounter = 2 ; loopCounter <= 20 ; loopCounter += 2) {
            System.out.println(loopCounter);
        }



        // 2

        System.out.println("\nAlphabet Printer");

        for ( char letter = 'A' ; letter <= 'Z' ; letter++ ) {
            System.out.print(letter);
        }



        // 3

        System.out.println("\n\nFactorial Calculator");

        int number = 5;
        int parsingNumber = number;
        long result = 1L;

        for (; parsingNumber >= 1 ; parsingNumber-- ) {
            result *= parsingNumber;
        }

        System.out.println("La factorielle de " + number + " est " + result);

    }

}
