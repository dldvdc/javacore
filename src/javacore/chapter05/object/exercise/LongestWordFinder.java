package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    final String text;
    String longestWord = null;


    LongestWordFinder(String text) {
        this.text = text;
    }


    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";
        LongestWordFinder longestWordFinder = new LongestWordFinder(text);

        // 1
        longestWordFinder.longestWord = longestWordFinder.searchForLongestWord();
        longestWordFinder.displayLongestWord();

        // 2
        longestWordFinder.longestWord = longestWordFinder.searchByCharacterScan();
        longestWordFinder.displayLongestWord();

    }

    private String[] getWordsFromSentence(String text) {
        return text.split(" ");
    }

    public String searchForLongestWord() {

        String[] splitWords = getWordsFromSentence(text);

        int maxLength = 0;
        String currentLongestWord = null;

        for (int i = 0 ; i < splitWords.length ; i++) {

            if (splitWords[i].length() > maxLength) {
                maxLength = splitWords[i].length();
                currentLongestWord = splitWords[i];
            }
        }

        return currentLongestWord;

    }


    public String searchByCharacterScan() {

        int maxLength = 0;
        int currentWordLength = 0;
        String potentialLongestWord = "";
        String currentLongestWord = null;

        for (int i = 0; i < text.length(); i++) {

            char currentLetter = text.charAt(i);

            if (currentLetter != ' ') {
                currentWordLength++;
                potentialLongestWord += currentLetter;

            } else {

                if (currentWordLength > maxLength) {
                    maxLength = currentWordLength;
                    currentLongestWord = potentialLongestWord;
                }

                currentWordLength = 0;
                potentialLongestWord = "";

            }
        }

        if (currentWordLength > maxLength) {
            currentLongestWord = potentialLongestWord;
        }

        return currentLongestWord;

    }

    public void displayLongestWord() {
        if (longestWord != null) {
            System.out.println("\nLe mot le plus long de votre texte est : " + longestWord);
        }

    }

}
