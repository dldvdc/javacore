package javacore.chapter05.object.exercise;

public class AlphabetVowelSearcher {

    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiouy";

        for (int alphabetIndex = 0 ; alphabetIndex < alphabet.length() ; alphabetIndex++) {

            for ( int vowelsIndex = 0 ; vowelsIndex < vowels.length() ; vowelsIndex++) {
                if (vowels.charAt(vowelsIndex) == (alphabet.charAt(alphabetIndex))) {

                    System.out.println("A l'index " + alphabetIndex + " de l'alphabet nous trouvons la voyelle \"" + alphabet.charAt(alphabetIndex) + "\".");

                }

            }

        }

        for (int i = 0; i < alphabet.length(); i++) {

            char caracter = alphabet.charAt(i);

            if (vowels.indexOf(caracter) != -1) {
                System.out.println("À l'index " + i + " de l'alphabet nous trouvons la voyelle \"" + caracter + "\".");
            }

        }

    }

}
