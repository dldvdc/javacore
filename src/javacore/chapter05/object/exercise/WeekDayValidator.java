package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class WeekDayValidator {

    public static void main(String[] arg) {

        // 1
        Scanner sc = new Scanner(System.in);
        String userWeekDay = "undefined";

        do {

            // 2
            System.out.println("What is the current week day ?");

            // 4
            userWeekDay = sc.nextLine().trim();

        // 3
        } while (!(userWeekDay.equalsIgnoreCase("monday")
                || userWeekDay.equalsIgnoreCase("tuesday")
                || userWeekDay.equalsIgnoreCase("wednesday")
                || userWeekDay.equalsIgnoreCase("thursday")
                || userWeekDay.equalsIgnoreCase("friday")
                || userWeekDay.equalsIgnoreCase("saturday")
                || userWeekDay.equalsIgnoreCase("sunday")));

        System.out.println("Thank you! Have a nice " + userWeekDay);

    }

}
