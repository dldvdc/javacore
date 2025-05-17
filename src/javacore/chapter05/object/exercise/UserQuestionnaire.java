package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class UserQuestionnaire {

    public static void main(String[] args) {

        // 1
        Scanner sc = new Scanner(System.in);

        // 2
        System.out.print("What's your first name ? ");
        String userFirstName = sc.nextLine();

        // 3
        System.out.print("How old are you ? ");
        int userAge = sc.nextInt();
        sc.nextLine();

        // 4
        String userContinue = "undefined";
        while ( !(userContinue.equals("no") || userContinue.equals("yes"))){


            System.out.print("Do you want to continue ? ( yes / no ) : ");
            userContinue = sc.nextLine().toLowerCase();

            if (userContinue.equals("no")) {

                displayUserAnswers(userFirstName, userAge);

            } else if (userContinue.equals("yes")) {

                // 5
                System.out.print("5 / 2 = ? ");
                float userQuotient = sc.nextFloat();

                // 6
                System.out.print("How old is the universe (in years) ? ");
                long userUniverseAge = sc.nextLong();

                // 7
                displayUserAnswers(userFirstName, userAge, userQuotient, userUniverseAge);

            }
        }
    }

    public static void displayUserAnswers(String userFirstName, int userAge) {
        System.out.println("Your firstname is " + userFirstName + ".\n"
                + "You are " + userAge + " years old.\n");
    }

    public static void displayUserAnswers(String userFirstName, int userAge, float userQuotient, long userUniverseAge ) {
        System.out.println("Your firstname is " + userFirstName + ".\n"
                + "You are " + userAge + " years old.\n"
                + "You said that 5 / 2 = " + userQuotient + ".\n"
                + "You think the universe is " + userUniverseAge + " years old.");
    }

}
