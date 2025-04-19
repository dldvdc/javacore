package javacore.chapter03.loop.exercise;

public class AlphabetPrinter {

    public static void main(String[] args) {


        //1
        char letter = 'A';
        char endLetter = 'Z';

        //2
        while ( letter <= endLetter ) {

            System.out.println(letter);
            letter++;

        }


        //3
        char targetLetter = 'a';

        while ( letter != targetLetter ) {

            letter++;

        }

        endLetter = 'z';

        while ( letter <= endLetter ) {

            System.out.println(letter);
            letter++;

        }

    }

}
