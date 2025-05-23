package javacore.chapter05.object.project;

import java.util.Scanner;

public class SubstitutionCipher {

    final String alphabet;
    String substitutionAlphabet;

    static String reservedSeparator = ":::";

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
        System.out.println(substitutionCipher.cipher(textToEncrypt));

        // 4
        System.out.println(substitutionCipher.cipher(textToEncrypt,3));

        // 5 - 6 - 7
        substitutionCipher.improvedCipher();

    }


    public static int getUserOption() {

        int attemptCount = 0;

        while (attemptCount <= 10) {

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

            attemptCount++;

        }

        return 0;

    }


    public static String getUserMessage() {

        int attemptCount = 0;

        while (attemptCount <= 10) {

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
            else {
                return inputText;
            }

            attemptCount++;

        }
        return null;

    }


    public static int getUserIterationCount() {

        int attemptCount = 0;

        while (attemptCount <= 10) {

            System.out.print("Combien souhaitez-vous d'itérations ? : ");

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break;
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
            catch (NumberFormatException | NullPointerException e) {
                System.out.println("Veuillez entrer un nombre valide.\n");
            }

            attemptCount++;

        }
        System.out.println("Une seule itération sera générée.");
        return 1;

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


    public boolean hasAllAlphabetletter(String substitutionAlphabet) {

        for (int i = 0; i < this.alphabet.length() ; i++ ) {

            char currentAlphabetChar = this.alphabet.charAt(i);
            boolean letterFound = false;

            for (int j = 0 ; j < substitutionAlphabet.length() ; j++) {

                if ( substitutionAlphabet.charAt(j) == currentAlphabetChar) {
                    letterFound = true;
                    break;
                }
            }
            if (!letterFound) return false;

        }
        return true;
    };


    public boolean hasOnlyAlphabetLetter(String substitutionAlphabet) {

        for (int i = 0; i < this.alphabet.length() ; i++ ) {

            char currentAlphabetChar = this.alphabet.charAt(i);
            boolean isAlphabetLetter = false;

            for (int j = 0 ; j < substitutionAlphabet.length() ; j++) {

                if ( substitutionAlphabet.charAt(j) == currentAlphabetChar) {
                    isAlphabetLetter = true;
                    break;
                }
            }
            if (!isAlphabetLetter) return false;

        }
        return true;
    };



    public String getUserSubstitutionAlphabet() {

        int attemptCount = 0;

        while (attemptCount <= 10) {

            System.out.print("Entrez votre alphabet de substitution : ");

            String inputSubstitutionAlphabet = scanner.nextLine().trim();

            if (inputSubstitutionAlphabet.length() != this.alphabet.length()) {
                System.out.println("La longueur de votre alphabet de substitution doit strictement correspondre aux "
                        + this.alphabet.length() + " l'alphabet latin : " + this.alphabet+ ".\n");
            } else if (!hasOnlyAlphabetLetter(inputSubstitutionAlphabet)) {
                System.out.println("Votre alphabet de substitution ne doit contenir que des lettres de l'alphabet latin ou des espaces\n");

            } else if (hasDuplicateChar(inputSubstitutionAlphabet)) {
                System.out.println("Votre alphabet de substitution ne peut pas contenir de doublons.\n");
            }
            // Celle -ci est superflue parce que la somme des deux vérifications précédentes la vérifie....
            else if (!hasAllAlphabetletter(inputSubstitutionAlphabet)) {
                System.out.println("Votre alphabet de substitution doit contenir toutes les lettres de l'alphabet latin\n");
            }
            else {
                return inputSubstitutionAlphabet;
            }

            attemptCount++;

        }

        return null;

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

    public String separatorFinder(String message) {

        char[] separatorCharArray = {
                ':', '!', '#', '$', '%', '&', '(', ')',
                '*', '+', ',', '-', '.', '/', ';', '<', '=',
                '>', '?', '@', '[', ']', '^', '_', '`', '{',
                '|', '}', '~'
        };

        // String testMessage = ":::!!!###$$$%%%&&&((()))***+++,,,---...///;;;<<<===>>>???@@@[[[]]]^^^___```{{{|||}}}~~~";

        for (char separatorChar : separatorCharArray) {
            String separatorCandidate = "" + separatorChar + separatorChar + separatorChar;

            if (!message.contains(separatorCandidate)) {
                return separatorCandidate;
            }

        }

        return "";

    }


    // 3
    public String cipher(String message) {
        return applyCipher(message, this.alphabet, this.substitutionAlphabet);
    }

    public String deCipher(String message) {
        return applyCipher(message, this.substitutionAlphabet, this.alphabet);
    }

    public String applyCipher(String message, String fromAlphabet, String toAlphabet) {
        String resultMessage = message;
        String nutShell = separatorFinder(resultMessage);

        if (nutShell.isEmpty()) {
            return "Vous pouvez nous prendre pour des nazis mais ne vous prenez pas pour Alan Turing.";
        }

        for (int i = 0; i < fromAlphabet.length(); i++) {

            String originalChar = String.valueOf(fromAlphabet.charAt(i));
            String charNut = nutShell + i + nutShell;
            resultMessage = resultMessage.replace(originalChar, charNut);

        }

        for (int i = 0; i < toAlphabet.length(); i++) {

            String charNut = nutShell + i + nutShell;
            String replacementChar = String.valueOf(toAlphabet.charAt(i));
            resultMessage = resultMessage.replace(charNut, replacementChar);

        }

        return resultMessage;
    }


    // 4
    public String cipher(String message, int cipherIterations) {

        String resultMessage = message;

        while (cipherIterations > 0) {
            resultMessage = this.cipher(resultMessage);
            cipherIterations--;
        }

        return resultMessage;

    }

    public String deCipher(String message, int cipherIterations) {

        String resultMessage = message;

        while (cipherIterations > 0) {
            resultMessage = this.deCipher(resultMessage);
            cipherIterations--;
        }

        return resultMessage;

    }


    // 5 - 6 - 7
    public void improvedCipher() {

        System.out.println("\nBienvenue chez Cipher !\n");

        int attemptCount = 0;

        while (attemptCount < 10) {

            int cipherOption = getUserOption();
            String message = getUserMessage();
            this.substitutionAlphabet = getUserSubstitutionAlphabet();
            int iterationCount = getUserIterationCount();

            String resultMessage;
            String messageStatus;

            if (cipherOption == 1) {
                resultMessage = cipher(message, iterationCount);
                messageStatus = "crypté";
            }
            else {
                resultMessage = deCipher(message, iterationCount);
                messageStatus = "décrypté";
            }

            System.out.println("\nVoici votre message " + messageStatus + " :\n\n");
            System.out.println(resultMessage);

            while (attemptCount < 10) {

                System.out.print("\nSouhaitez-vous traiter un autre message ? (o/n) : ");
                String restartChoice = scanner.nextLine().trim().toLowerCase();

                if (restartChoice.equals("o")) break;

                else if (!restartChoice.equals("n")) {
                    System.out.println("\nRéponse non valide. Merci de répondre par 'o' ou 'n'.\n");
                    attemptCount++;
                }

                else return;

            }

        }

    }

}
