package javacore.chapter02.condition.exercise;

public class FirstBooleanCondition {
    public static void main(String[] arg) {

        //1
        byte age = 17;
        boolean isAdult = age >= 18;

        //2
        if ( age <= 0 ) {
            System.out.println("Vous n'êtes même pas né...");
        }
        else if ( age >= 18 ) {
            System.out.println("Vous êtes majeur");
        }
        else {
            System.out.println("Vous êtes mineur");
        }

        //3
        if (isAdult) {
            System.out.println("Vous êtes majeur");
        }
        else {
            System.out.println("Vous êtes mineur");
        }


    }
}
