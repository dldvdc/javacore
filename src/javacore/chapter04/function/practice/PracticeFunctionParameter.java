package javacore.chapter04.function.practice;

public class PracticeFunctionParameter {

    public static void main(String[] args) {

        for (int i = 1 ; i < 10 ; i++) {

            displaySection(i, "Contenu personalisé");

        }

    }

    public static void displaySection(int sectionNumber, String sectionContent) {

        System.out.println("---- Début de la Section n°" + sectionNumber);
        displaySeparator(30, '-');
        System.out.println("---- " + sectionContent);
        displaySeparator(30, '-');
        System.out.println("---- Fin de la Section n°" + sectionNumber);
        System.out.println("\n");

    }

    public static void displaySeparator(int charNumber, char separatorChar) {
        for (int i = 0 ; i < charNumber ; i++) {
            System.out.print(separatorChar);
        }
        System.out.println();
    }
}
