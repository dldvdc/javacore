package javacore.chapter05.object.exercise;

import java.util.Random;
import java.util.Scanner;

public class MysteryNumberGame {


    private static final int USER_MAX_ATTEMPT = 7;
    private final int mysteryNumber;

    private final int MIN;
    private final int MAX;


    public MysteryNumberGame(int min, int max) {

        Random random = new Random();
        this.MIN = min;
        this.MAX = max;
        this.mysteryNumber = random.nextInt((this.MAX - this.MIN) + 1) + this.MIN;

    }

    public MysteryNumberGame() {
        this(1, 100);
    }


    public static void main(String[] args) {

        MysteryNumberGame game = new MysteryNumberGame(1, 100);
        game.launchGame();

    }


    private void launchGame() {

        Scanner scanner = new Scanner(System.in);
        int userAttempt = 0;

        System.out.print("\nCherchez le nombre mystère : ");

        do {

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

                if (userAttempt ==USER_MAX_ATTEMPT) {
                    System.out.print("Vous avez perdu...");
                    break;
                }
                else {
                    System.out.println("Il vous reste encore " + (USER_MAX_ATTEMPT - userAttempt) + " essais...\n");
                    System.out.print("Rejouez : ");
                }

            }

        } while (userAttempt < USER_MAX_ATTEMPT);

    }

}
