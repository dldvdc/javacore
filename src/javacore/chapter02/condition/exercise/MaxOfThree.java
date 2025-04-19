package javacore.chapter02.condition.exercise;

public class MaxOfThree {

    public static void main(String[] args) {


        int a = 558;
        int b = 58;
        int c = 5508;


        // Calcul du plus grand des nombres

        if ( a != b && b != c && a != c ) {

            if ( a > b && a > c ) {
                System.out.println("a est le plus grand");
            } else if ( b > a && b > c ) {
                System.out.println("b est le plus grand");
            } else {
                System.out.println("c est le plus grand");
            }

        // Gestion des valeurs égales

        } else if ( a == b && b == c ) {
            System.out.println("Les trois valeurs sont égales !");
        } else if ( a == b ) {
            System.out.println("a et b sont égaux !");
        } else if ( b == c ) {
            System.out.println("b et c sont égaux !");
        } else {
            System.out.println("a et c sont égaux !");
        }
    }

}
