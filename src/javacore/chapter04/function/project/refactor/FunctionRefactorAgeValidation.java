package javacore.chapter04.function.project.refactor;

public class FunctionRefactorAgeValidation {

    public static void main(String[] args) {


        // Date d'aujourd'hui

        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();


        // Données de l'utilisateur :

        int birthDay = 15;
        int birthMonth = 6;
        int birthYear = 2009;


        // Calcul de l'âge de l'utilisateur :

        int age = getAge(currentYear, currentMonth, currentDay, birthYear, birthMonth, birthDay);


        // Vérification de la majorité

        int majorityAge = 18;

        boolean isMajor = verifyMajority(majorityAge, age);


        // Calcul du temps restant avant majorité

        int daysBeforeMajority = 0;

        if (!isMajor) {
            daysBeforeMajority = getDaysBeforeMajority(currentYear, currentMonth,currentDay, majorityAge, birthYear, birthMonth, birthDay);
        }


        // Affichage de la synthèse

    }

    // ------------------------
    //   Fonctions de calculs
    // ------------------------


    public static int getAge(int currentYear, int currentMonth, int currentDay, int birthYear, int birthMonth, int birthDay) {

        int age = currentYear - birthYear;

        if ( currentMonth == birthMonth && currentDay < birthDay || currentMonth < birthMonth ) {
            age--;
        }

        return age;

    }


    public static boolean verifyMajority (int majorityAge, int age) {

        boolean isMajor = age >= majorityAge;

        return isMajor;

    }


    public static int getDaysBeforeMajority (int currentYear, int currentMonth, int currentDay, int majorityAge, int birthYear, int birthMonth, int birthDay) {

        double daysAlive = (( currentDay - birthDay ) + ( currentMonth - birthMonth ) * 30.44 + (currentYear - birthYear) * 365.25);

        return (int) (majorityAge * 365.25 - daysAlive);

    }


    // ------------------------
    //  Fonctions d'affichage
    // ------------------------

}
