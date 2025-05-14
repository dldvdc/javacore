package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {


        // 1

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
                "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat" +
                " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        // char[][] vowelsCount = {'a', 'e', 'i', 'o', 'u', 'y'} int[6];
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int yCount = 0;

        for (int i = 0; i < lorem.length(); i++) {

            char extractedChar = Character.toLowerCase(lorem.charAt(i));

            switch (extractedChar) {
                case 'a' -> aCount++;
                case 'e' -> eCount++;
                case 'i' -> iCount++;
                case 'o' -> oCount++;
                case 'u' -> uCount++;
                case 'y' -> yCount++;
            }

        }

        System.out.print("\nLorem contient " + aCount + " voyelles 'a', ");
        System.out.print( eCount + " voyelles 'e', ");
        System.out.print( iCount + " voyelles 'i', ");
        System.out.print( oCount + " voyelles 'o', ");
        System.out.print( uCount + " voyelles 'u', ");
        System.out.print( "et " + yCount + " voyelles 'y'.\n");


        // 2 - Alternative avec Tableaux et Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un court texte de votre choix : ");
        String userText = scanner.nextLine().trim().toLowerCase();

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int[] counts = new int[vowels.length];

        for (int textIndex = 0; textIndex < userText.length(); textIndex++) {

            char c = userText.charAt(textIndex);

            for (int vowelsIndex = 0; vowelsIndex < vowels.length; vowelsIndex++) {

                if (c == vowels[vowelsIndex]) {
                    counts[vowelsIndex]++;
                }

            }

        }

        System.out.println("\nCompte des voyelles de votre texte");

        for (int i = 0; i < vowels.length; i++) {
            System.out.println("'" + vowels[i] + "' : " + counts[i] + " occurences.");
        }


        // 3

        System.out.println("\nSaisissez un court texte de votre choix : ");
        userText = scanner.nextLine().trim().toLowerCase();

        counts = new int[vowels.length];

        for (int vowelsIndex = 0; vowelsIndex < vowels.length; vowelsIndex++) {

            char vowel = vowels[vowelsIndex];
            int index = userText.indexOf(vowel);

            while (index != -1) {
                counts[vowelsIndex]++;
                index = userText.indexOf(vowel, index + 1);
            }

        }

        System.out.println("\nCompte des voyelles de votre texte : ");

        for (int i = 0; i < vowels.length; i++) {
            System.out.println("'" + vowels[i] + "' : " + counts[i] + " occurences.");
        }

    }

}
