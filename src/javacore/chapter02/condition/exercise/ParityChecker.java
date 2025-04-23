package javacore.chapter02.condition.exercise;

public class ParityChecker {

    public static void main(String[] arg) {

        // 1 - 5 - 6
        long number = 3333777799992L;
        boolean isEven = number % 2 == 0;

        // 2
        System.out.println("% semble être le bon candidat");

        // 3
        if ( number % 2 == 0 ) {
            System.out.println("Le nombre " + number + " est pair.");
        }

        // 4
        else {
            System.out.println("Le nombre " + number + " est impair.");
        }

    }

}
