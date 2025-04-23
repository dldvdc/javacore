package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args) {


        int a = 558;
        int b = 558;
        int c = 58;


        // Gestion des valeurs égales

        if ( a == b && b == c ) {
            System.out.println("Les trois valeurs sont égales !");
        } else if ( a == b ) {
            System.out.println("a et b sont égaux !");
        } else if ( b == c ) {
            System.out.println("b et c sont égaux !");
        } else if ( a == c ){
            System.out.println("a et c sont égaux !");
        }

        // Calcul du plus grand des nombres

        else {
            if (a > b && a > c) {
                System.out.println("a est le plus grand");
            } else if (b > a && b > c) {
                System.out.println("b est le plus grand");
            } else {
                System.out.println("c est le plus grand");
            }
        }

    }

}
