package javacore.chapter04.function.project.refactor;

public class FunctionRefactorFullPyramid {

    public static void main(String[] args) {

        makeFullPyramid(12, '&');

    }

    public static void makeFullPyramid(int numberOfRows, char pyramidChar) {

        for (int y = 0; y < numberOfRows; y++) {

            for (int space = 0; space < numberOfRows - y; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < (y * 2 + 1); star++) {
                System.out.print(pyramidChar);
            }

            System.out.println();

        }

    }

}