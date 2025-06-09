package javacore.chapter05.object.exercise;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int userMaxAttempt = 7;

    private final int mysteryNumber;

    public MysteryNumberGame() {
        Random random = new Random();
        this.mysteryNumber = random.nextInt((MAX - MIN) + 1) + MIN;
        this.launchGame();
    }

    public static void main(String[] args) {

        new MysteryNumberGame();

    }

    private void launchGame() {

        Scanner scanner = new Scanner(System.in);
        int userAttempt = 0;

        System.out.print("\nCherchez le nombre mystère : ");

        while (userAttempt < userMaxAttempt) {

            int userNumber = Integer.parseInt(scanner.nextLine());

            if (userNumber == mysteryNumber) {
                System.out.println("Vous avez gagné ! Le nombre mystère était bien " + mysteryNumber);
                break;
            }
            else {

                if (userNumber < mysteryNumber) {
                    System.out.println("C'est plus grand !");
                }
                else {
                    System.out.println("C'est plus petit !");
                }

                userAttempt++;

                if (userAttempt == userMaxAttempt) {
                    System.out.print("Vous avez perdu...");
                    break;
                }
                else {
                    System.out.println("Il vous reste encore " + (userMaxAttempt - userAttempt) + " essais...\n");
                }

            }

        }

    }

}
