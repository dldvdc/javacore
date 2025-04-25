package javacore.chapter04.function.project.refactor;

public class FunctionRefactorAgeValidation {

    public static void main(String[] args) {

        displayAgeVerification(15, 6, 2013);

    }


    //  Fonction d'affichage globale

    public static void displayAgeVerification(int birthDay, int birthMonth, int birthYear) {


        // Date d'aujourd'hui

        java.time.LocalDate currentDate = java.time.LocalDate.now();

        final int CURRENT_DAY   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        final int CURRENT_MONTH = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        final int CURRENT_YEAR  = currentDate.getYear();


        // Calcul de l'âge de l'utilisateur :

        int age = getAge(CURRENT_YEAR, CURRENT_MONTH, CURRENT_DAY, birthYear, birthMonth, birthDay);

        System.out.println("\nVous avez " + age + " ans");


        // Vérification de la majorité

        int majorityAge = 18;

        boolean isMajor = verifyMajority(majorityAge, age);

        if (!isMajor) {

            System.out.println("Vous n'etes pas encore majeur...");

            // Calcul du temps restant avant majorité

            String timeBeforeMajority = getTimeBeforeMajority(CURRENT_YEAR, CURRENT_MONTH,CURRENT_DAY,
                                                       majorityAge, birthYear, birthMonth, birthDay);

            System.out.println("Mais plus que " + timeBeforeMajority + " avant de gouter aux joies de la majorite");

        }

        else {

            System.out.println("Vous etes majeur");

        }

    }


    //   Fonctions de calculs

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


    public static String getTimeBeforeMajority (int currentYear, int currentMonth, int currentDay, int majorityAge, int birthYear, int birthMonth, int birthDay) {

        double daysAlive = (( currentDay - birthDay ) + ( currentMonth - birthMonth ) * 30.44 + (currentYear - birthYear) * 365.25);

        double totalDays = majorityAge * 365.25 - daysAlive;

        int years = (int) (totalDays / 365.25);
        double remainingDaysAfterYears = totalDays - years * 365.25;

        int months = (int) (remainingDaysAfterYears / 30.44);
        double remainingDaysAfterMonths = remainingDaysAfterYears - months * 30.44;

        int days = (int) Math.round(remainingDaysAfterMonths);

        return years + " an(s), " + months + " moi(s) et " + days + " jour(s)";

    }

}
