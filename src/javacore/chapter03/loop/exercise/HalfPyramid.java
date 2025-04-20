package javacore.chapter03.loop.exercise;

public class HalfPyramid {

    public static void main(String[] args) {


        // 1
        int numberOfRows = 50;

        // 2
        for ( int rowNumber = 1 ; rowNumber < numberOfRows ; rowNumber++) {

            // 3
            for ( int starQuantity = 1 ; starQuantity < rowNumber ; starQuantity++ ) {
                System.out.print('*');
            }

            System.out.println();

        }

    }

}
