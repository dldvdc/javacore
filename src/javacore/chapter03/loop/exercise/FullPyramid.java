package javacore.chapter03.loop.exercise;

public class FullPyramid {

    public static void main(String[] args) {


        // Composants de la pyramide

        int numberOfRows = 12;
        char pyramidChar = '*';


        // Affichage de la pyramide

        for ( int y = 0 ; y < numberOfRows ; y++) {

            for (int space = 0; space < numberOfRows - y ; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < (y * 2 + 1); star++) {
                System.out.print(pyramidChar);
            }

            System.out.println();

        }

    }

}
