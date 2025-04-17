package javacore.chapter01.variable.practice;

public class PracticeOperatorArithmetic {

    public static void main(String[] args) {

        System.out.println("Hello" + ' ' + "World!");

        String hello = "Hello";
        char espace = ' ';
        String world = "World";
        char exclamation = '!';

        System.out.println(hello + espace + world + exclamation);

        int a = 56;
        int b = 12;

        int calcul = a * 3 + b % a / 3 - b + a;

        System.out.println(calcul);

    }

}
