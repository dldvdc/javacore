package javacore.chapter03.loop.practice;

public class PracticeLoopBreak {

    public static void main(String[] args) {

        while (true) {

            for (int i = 0 ; i < 10 ; i++) {
                System.out.println(i);
                break;
            }

            break;

        }


        int potentialPrimeNumber = 1;
        int primeNumberFound = 1;

        System.out.println("Liste des 50 premiers Nombres Premiers : ");

        while (primeNumberFound <= 50) {

            boolean isCurrentNumberPrime = true;

            for (int potentialDivisor = 2 ; potentialDivisor <= potentialPrimeNumber -1 ; potentialDivisor++) {

                if (potentialPrimeNumber % potentialDivisor == 0) {

                    isCurrentNumberPrime = false;
                    break;

                }

            }

            if (isCurrentNumberPrime) {

                System.out.println("-> " + potentialPrimeNumber + " est le Nombre Premier N°" + primeNumberFound);
                primeNumberFound++;

            }

            potentialPrimeNumber++;

        }

    }

}
