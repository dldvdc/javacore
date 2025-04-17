package javacore.chapter02.condition.practice;

public class PracticeCondition {

    public static void main(String[] arg) {

        int age = 19;

        if ( age <= 0 ) {
            System.out.println("Vous n'êtes pas né...");
        }
        else if ( age < 18 ) {
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("Vous êtes majeur");
        }

    }
}
