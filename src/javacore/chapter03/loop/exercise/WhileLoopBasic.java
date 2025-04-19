package javacore.chapter03.loop.exercise;

public class WhileLoopBasic {

    public static void main(String[] args) {


        int loopCounter = 1;

        System.out.println("\nBoucle n° 1");

        while ( loopCounter < 11 ) {

            System.out.println(loopCounter);
            loopCounter++;

        }

        System.out.println("\nBoucle n° 2");

        while ( loopCounter > 1 ) {

            loopCounter--;
            System.out.println(loopCounter);

        }

        System.out.println("\nBoucle n° 3");

        loopCounter++;

        while ( loopCounter <= 20 ) {

            System.out.println(loopCounter);
            loopCounter += 2;

        }

    }

}
