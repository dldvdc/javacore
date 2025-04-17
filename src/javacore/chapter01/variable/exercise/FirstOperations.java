package javacore.chapter01.variable.exercise;

public class FirstOperations {
    public static void main(String[] args) {

        System.out.println("\n ------------------- Section N°1 -------------------\n");

        int a = 53;
        int b = 5;

        int sum = a + b;

        int subtraction = a - b;

        int multiplication = a * b;

        int division = a / b;
        int reste = a % b;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        System.out.println("La somme de " + a + " et " + b + " est égale à " + sum);
        System.out.println("La différence de " + a + " et " + b + " est égale à " + subtraction);
        System.out.println("La multiplication de " + a + " par " + b + " est égale à " + multiplication);
        System.out.println("La division de " + a + " par " + b + " est égale à " + division + ", il reste " + reste);



        System.out.println("\n ------------------- Section N°2 -------------------\n");

        int c = 8;
        int d = 13;

        c += d; // c = c + d;

        System.out.println(c);

        d-= 5; // d = d - 5;

        System.out.println(d);

        c *= 3; // c = c * 5;

        System.out.println(c);

        d /= 3; // d = d / 3;

        System.out.println(d);


        System.out.println("\n ------------------- Section N°3 -------------------\n");

        int e = 1 * 5 + 2;
        // 1 * 5 = 5
        // 5 + 2 = 7

        System.out.println(e);


        int f = 1 * (5 + 2);
        // 5 + 2 = 7
        // 1 * 7 = 7

        System.out.println(f);


        int g = ((2 * 5) - 2 / (4 - 2)) - 1;
        // 2 * 5 = 10
        // 4 - 2 = 2
        // 2 / 2 = 1
        // 10 - 1 = 9
        // 9 - 1 = 8

        System.out.println(g);

    }
}
