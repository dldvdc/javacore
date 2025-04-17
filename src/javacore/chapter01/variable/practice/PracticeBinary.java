package javacore.chapter01.variable.practice;

public class PracticeBinary {
    public static void main(String[] args) {

        int n = 1400;
        int x = n;

        int b1 = n % 2;
        n /= 2;

        int b2 = n % 2;
        n /= 2;

        int b3 = n % 2;
        n /= 2;

        int b4 = n % 2;
        n /= 2;

        int b5 = n % 2;
        n /= 2;

        int b6 = n % 2;
        n /= 2;

        int b7 = n % 2;
        n /= 2;

        int b8 = n % 2;
        n /= 2;


        System.out.print("Représentation binaire de la valeur decimale " + x + " = " + b8 + b7 + b6 + b5 + b4 + b3 + b2 + b1);

    }
}
