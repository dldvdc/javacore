package javacore.chapter05.object.exercise;

public class ReversedString {

    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";

        for (int index = text.length() - 1 ; index >= 0 ; index--) {
            System.out.print(text.charAt(index));
        }

    }

}
