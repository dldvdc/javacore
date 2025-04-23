package javacore.chapter03.loop.exercise;

public class WhileLoopBasic {

    public static void main(String[] args) {


        int loopCounter = 0;

        System.out.println("\nBoucle n° 1");

        while ( loopCounter < 10 ) {
            loopCounter++;
            System.out.println(loopCounter);
        }

        System.out.println("\nBoucle n° 2");

        while ( loopCounter > 0 ) {
            System.out.println(loopCounter);
            loopCounter--;
        }

        System.out.println("\nBoucle n° 3");


        while ( loopCounter < 20 ) {
            loopCounter += 2;
            System.out.println(loopCounter);
        }

    }

}
