package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args) {


        // Composantes du damier

        char whiteChar = '.';
        char blackChar = '#';

        int chessboardSize = 8;

        boolean blackTurn = true;


        // Affichage du damier

        for ( int y = 0 ; y < chessboardSize ; y++) {

            for (int x = 0; x < chessboardSize; x++) {

                if (blackTurn) {

                    System.out.print("  " + blackChar);

                } else {

                    System.out.print("  " + whiteChar);

                }

                blackTurn = !blackTurn;

            }

            System.out.println();

            if ( chessboardSize % 2 == 0 ) {

                blackTurn = !blackTurn;

            }

        }

    }

}
