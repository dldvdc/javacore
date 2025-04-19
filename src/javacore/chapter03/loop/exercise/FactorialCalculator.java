package javacore.chapter03.loop.exercise;

public class FactorialCalculator {

    public static void main(String[] args) {

        int number = 10;
        int numberInit = number;
        int result = 1;

        while (number >= 1) {

            // System.out.print(number + " x ");
            result *= number;

            number--;

        }

        // System.out.print(" = " + result);

        if (result < 0) {
            System.out.println("La valeur obtenue est trop grande pour être stockée dans un type int...");
        }

        else {

            if (result == 0){
                result++;
            }

            System.out.println("La factorielle de " + numberInit + " est " + result);

        }
    }

}
