package javacore.chapter05.object.project;

import java.util.Scanner;

public class SubstitutionCipher {

    final String alphabet;
    String substitutionAlphabet;

    private static final Scanner scanner = new Scanner(System.in);

    public SubstitutionCipher(String alphabet, String substitutionAlphabet) {
        this.alphabet = alphabet;
        this.substitutionAlphabet = substitutionAlphabet;
    }


    public static void main(String[] args) {

        SubstitutionCipher substitutionCipher = new SubstitutionCipher(
                "abcdefghijklmnopqrstuvwxyz",
                "ntrhwbgeyjzlsoaqdmcuvfpxik");

        String textToEncrypt = "ce message secret ne doit pas arriver entre de mauvaises mains !";

        // 1
        System.out.println(substitutionCipher.basicCipher(textToEncrypt));

        // 2 ???
        System.out.println(substitutionCipher.cascadeCipher(textToEncrypt));

        // 3
        System.out.println(substitutionCipher.cipher(textToEncrypt, true));

        // 4
        System.out.println(substitutionCipher.cipher(textToEncrypt, true, 3));

        // 5 - 6 - 7
        substitutionCipher.improvedCipher();

    }


    public static int getUserOption() {

        while (true) {

            System.out.println("Sélectionnez l'une des options ci-dessous : ");
            System.out.println("(1) Crypter un message");
            System.out.println("(2) Décrypter un message");

            try {

                int inputMethodIndex = Integer.parseInt(scanner.nextLine());

                if (inputMethodIndex != 1 && inputMethodIndex !=2) {
                    System.out.println("Saisissez uniquement un des numéros correspondant aux options disponibles.\n");
                }
                else {
                    return inputMethodIndex;
                }

            }
            catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.\n");
            }

        }

    }


    public static String getUserMessage() {

        while (true) {

            System.out.print("\nSaisissez le message que vous souhaitez traiter: ");
            String inputText  = scanner.nextLine().toLowerCase();

            if (inputText.trim().isEmpty()) {
                System.out.println("Le message ne peut pas être vide.\n");
            }
            else if (inputText.length() > 10000) {
                System.out.println("Le message est trop long (maximum 10000 caractères).\n");
            }
            else if (!inputText.trim().matches(".*[a-z].*")) {
                System.out.println("Le message doit contenir au moins une lettre de l'alphabet.\n");
            }
            else if (inputText.contains(":::")) {
                System.out.println("Le motif \":::\" est réservé.\n");
            }
            else {
                return inputText;
            }

        }

    }


    public static int getUserIterationCount() {

        while (true) {

            System.out.print("Combien souhaitez-vous d'itérations ? : ");

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                return 1;
            }

            try {

                int inputIterationCount = Integer.parseInt(input);

                if (inputIterationCount < 0) {
                    System.out.println("Veuillez saisir une valeur positive.\n");
                }
                else if (inputIterationCount > 200) {
                    System.out.println("Le nombre d'itérations maximum est de 200.\n");
                }
                else {
                    return inputIterationCount;
                }

            }
            catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.\n");
            }

        }

    }


    public static boolean hasDuplicateChar(String alphabet) {

        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);

            for (int j = i + 1; j < alphabet.length(); j++) {
                if (currentChar == alphabet.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }


    public String getUserSubstitutionAlphabet() {

        while (true) {

            System.out.print("Entrez votre alphabet de substitution : ");

            String inputSubstitutionAlphabet = scanner.nextLine().trim();

            if (inputSubstitutionAlphabet.length() != this.alphabet.length()) {
                System.out.println("La longueur de votre alphabet de substitution doit strictement correspondre aux "
                        + this.alphabet.length() + " l'alphabet latin : " + this.alphabet+ ".\n");
            }
            else if (!inputSubstitutionAlphabet.matches("[a-z]")) {
                System.out.println("L'alphabet de substitution doit uniquement contenir des lettres minuscules.\n");
            }
            else if (hasDuplicateChar(inputSubstitutionAlphabet)) {
                System.out.println("Votre alphabet de substitution ne peut pas contenir de doublons.\n");
            }
            else {
                return inputSubstitutionAlphabet;
            }

        }

    }


    // 1
    public String basicCipher(String textToEncrypt) {

        String textEncrypted = "";

        for (int textIndex = 0; textIndex < textToEncrypt.length(); textIndex++) {

            char currentChar = textToEncrypt.charAt(textIndex);
            boolean isCharEncrypted = false;

            for (int alphabetIndex = 0; alphabetIndex < this.alphabet.length(); alphabetIndex++) {

                char currentAlphabetChar = this.alphabet.charAt(alphabetIndex);

                if (currentChar == currentAlphabetChar) {
                    textEncrypted += this.substitutionAlphabet.charAt(alphabetIndex);
                    isCharEncrypted = true;
                    break;
                }
            }

            if (!isCharEncrypted) {
                textEncrypted += currentChar;
            }

        }

        return textEncrypted;

    }


    // 2 - Ici le résultat est en cascade donc un vrai petit challenge à décrypter...

    public String cascadeCipher(String textToEncrypt) {

        String encryptedText = textToEncrypt;

        for (int i = 0; i < this.alphabet.length(); i++) {
            String originalLetter = String.valueOf(this.alphabet.charAt(i));
            String substituteLetter = String.valueOf(this.substitutionAlphabet.charAt(i));

            encryptedText = encryptedText.replaceAll(originalLetter, substituteLetter);
        }

        return encryptedText;

    }


    // 3
    public String cipher(String message, boolean toEncrypt) {

        String resultMessage = message;

        for (int i = 0; i < this.alphabet.length(); i++) {

            String originalChar = toEncrypt ?
                    String.valueOf(this.alphabet.charAt(i)) : String.valueOf(this.substitutionAlphabet.charAt(i));
            String charNut = ":::" + i + ":::" ;

            resultMessage = resultMessage.replaceAll(originalChar, charNut);
        }

        for (int i = 0; i < this.alphabet.length(); i++) {

            String charNut = ":::" + i + ":::";
            String replacementChar = toEncrypt ?
                    String.valueOf(this.substitutionAlphabet.charAt(i)) : String.valueOf(this.alphabet.charAt(i));

            resultMessage = resultMessage.replaceAll(charNut, replacementChar);
        }

        return resultMessage;

    }


    // 4
    public String cipher(String message, boolean toEncrypt, int cipherIterations) {

        String resultMessage = message;

        while (cipherIterations > 0) {
            resultMessage = this.cipher(resultMessage, toEncrypt);
            cipherIterations--;
        }

        return resultMessage;

    }


    // 5 - 6 - 7
    public void improvedCipher() {

        System.out.println("\nBienvenue chez Cipher !\n");

        while (true) {

            int cipherOption = getUserOption();
            boolean isEncrypted = cipherOption == 1;
            String message = getUserMessage();
            this.substitutionAlphabet = getUserSubstitutionAlphabet();
            int iterationCount = getUserIterationCount();

            String resultMessage = cipher(message, isEncrypted, iterationCount);
            String messageStatus = isEncrypted ? "crypté" : "décrypté";

            System.out.println("\nVoici votre message " + messageStatus + " :\n\n");
            System.out.println(resultMessage);

            while (true) {

                System.out.print("\nSouhaitez-vous traiter un autre message ? (o/n) : ");
                String restartChoice = scanner.nextLine().trim().toLowerCase();

                if (restartChoice.equals("o")) break;

                else if (!restartChoice.equals("n")) {
                    System.out.println("\nRéponse non valide. Merci de répondre par 'o' ou 'n'.\n");
                }

                else return;

            }

        }

    }

}
