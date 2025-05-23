package javacore.chapter04.function.exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberSearcherV3 {

    public static void main(String[] args) {

        checkIfPrimeNumber(5);

    }

    public static boolean isPrimeNumber(int potentialPrimeNumber) {

        for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

            if (potentialPrimeNumber % potentialDivisor == 0) {
                return false;
            }

        }
        return true;

    }

    public static void checkIfPrimeNumber(int potentialPrimeNumber) {

        if (isPrimeNumber(potentialPrimeNumber)) {
            System.out.println(potentialPrimeNumber + " est un Nombre Premier !");
        }

        else {
            System.out.println(potentialPrimeNumber + " n'est un pas Nombre Premier...");
        }

    }

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Supprime tous les multiples de p
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collecte les nombres premiers
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}



