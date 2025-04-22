package javacore.chapter04.function.practice;

public class PracticeFunction {

    public static void main(String[] args) {

        System.out.println("Hello World !");

        int test = 1;

        test();

        // test2; // Defined in the test() scope (function)

    }

    public static void test() {

        System.out.println("Affichage fonction");

        int test = 0;
        int test2 = 2;

    }


}
