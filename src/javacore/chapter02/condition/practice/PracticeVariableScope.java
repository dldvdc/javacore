package javacore.chapter02.condition.practice;

public class PracticeVariableScope {
    public static void main(String[] args) {

        int age = 15;

        if ( age < 18 ) {

            System.out.println("Vous êtes mineur (" + age + " ans)");

            int discountPercentage = 20;

            System.out.println("Vous avez le droit à " + discountPercentage + "% de réduction");

            if ( true ) {

                System.out.println(discountPercentage);

            }

        }

        // System.out.println(discountPercentage);

    }
}
