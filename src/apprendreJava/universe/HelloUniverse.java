package apprendreJava.universe;

public class HelloUniverse {

    public static void main(String... args) {

        System.out.println("\nHello Universe!\n");

        // Introduction
        // Imperative Programming
        // Sequential Structure

        byte planetCount = 8;

        String summary = "According to the latest news, there are " + planetCount + " planets in the Solar System.";
        System.out.println(summary);

        planetCount++;
        summary = "However, a few years ago, the number was considered to be " + planetCount + ".\n";
        System.out.println(summary);

        // Conditional Structure
        // if - else if - else

        short year = 1800;

        if (year < 1600 || year > 2025) {
            System.out.println("The program cannot provide data for the year " + year + ".");
        } else {

            String message = "In %d, the known number of planets in the Solar System was: %d\n\n";

            if (year < 1781) {
                planetCount = 7;
            } else if (year < 1846) {
                planetCount = 8;
            } else if (year < 2006) {
                planetCount = 9;
            } else {
                planetCount = 8;
            }

            System.out.printf(message, year, planetCount);
        }

        // switch expression

        planetCount = 7;

        String switchMessage = switch (planetCount) {
            case 7 -> "In the 16th century, only 7 planets had been discovered.";
            case 8 -> "The number of planets increased to 8 in the 17th century, and was later reduced from 9 to 8 in 2006.";
            case 9 -> "The number of planets increased to 9 in the 18th century and remained so until 2006.";
            default -> "The program cannot provide data for a planet count of " + planetCount + ".";
        };

        System.out.println(switchMessage + "\n");

        // Iterative Structure - for loop

        for (planetCount = 7; planetCount <= 9; planetCount++) {

            switch (planetCount) {
                case 7 -> System.out.println("In the 16th century, only 7 planets had been discovered.");
                case 8 -> System.out.println("The number of planets increased to 8 in the 17th century, and was later reduced from 9 to 8 in 2006.");
                case 9 -> System.out.println("The number of planets increased to 9 in the 18th century and remained so until 2006.");
                default -> System.out.println("The program cannot provide data for a planet count of " + planetCount + ".");
            }
        }

        // Iterative Structure - while loop

        planetCount = 7;

        while (planetCount <= 9) {

            switch (planetCount) {
                case 7 -> System.out.println("In the 16th century, only 7 planets had been discovered.");
                case 8 -> System.out.println("The number of planets increased to 8 in the 17th century, and was later reduced from 9 to 8 in 2006.");
                case 9 -> System.out.println("The number of planets increased to 9 in the 18th century and remained so until 2006.");
                default -> System.out.println("The program cannot provide data for a planet count of " + planetCount + ".");
            }

            planetCount++;
        }
    }
}
