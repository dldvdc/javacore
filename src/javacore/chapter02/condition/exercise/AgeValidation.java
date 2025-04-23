package javacore.chapter02.condition.exercise;

public class AgeValidation {

    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme

        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay   = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear  = currentDate.getYear();       // Année courante (202X)

        System.out.println("\nNous sommes le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */


        // Données de l'utilisateur :

        int birthDay = 15;
        int birthMonth = 6;
        int birthYear = 2009;
        String birthDate = birthDay + "/" + birthMonth + "/" + birthYear;

        System.out.println("Vous êtes né le " + birthDate);


        // Calcul de l'âge de l'utilisateur :

        int age = currentYear - birthYear;

        if ( currentMonth == birthMonth && currentDay < birthDay || currentMonth < birthMonth ) {
            age--;
        }


        // Implémentation du calcul de la majorité

        if ( age >= 18) {

            System.out.println("Vous avez " + age + " ans, vous êtes majeur !");

        } else {

            System.out.println("Vous êtes mineur...");

            int yearsRemaining = 18 + (birthYear - currentYear);
            int monthsRemaining = birthMonth - currentMonth;
            int daysRemaining = birthDay - currentDay;

            if ( daysRemaining < 0 ) {
                daysRemaining += 30;
                monthsRemaining--;
            }

            if ( monthsRemaining < 0 ) {
                monthsRemaining += 12;
                yearsRemaining--;
            }


            // Calcul du temps restant

            System.out.print("Il vous reste encore ");

            if ( yearsRemaining > 0 ) {
                System.out.print(yearsRemaining + " année(s) ");
            }
            if ( monthsRemaining > 0 ) {
                System.out.print(monthsRemaining + " mois ");
            }
            if ( daysRemaining > 0 ) {
                System.out.print(daysRemaining + " jour(s) ");
            }

            System.out.println("avant d'atteindre la majorité");

        }

        // --------------------------
        // Implémentation alternative

        double daysAlive = (( currentDay - birthDay ) + ( currentMonth - birthMonth ) * 30.44 + (currentYear - birthYear) * 365.25);
        double majority = 18 * 365.25;
        boolean isMajor = daysAlive >= majority;


        if (isMajor) {

            System.out.println("\nVous êtes Majeur");

        } else {

            System.out.println("\nVous n'êtes pas majeur");

            // Calcul du temps restant

            double timeInDaysBeforeMajority = majority - daysAlive;

            int yearsBeforeMajority = (int) (timeInDaysBeforeMajority / 365.65);
            double daysRemainingAfterYears = timeInDaysBeforeMajority % 365.25;

            int monthsBeforeMajority = (int) (daysRemainingAfterYears / 30.44);
            int daysBeforeMajority = (int) (daysRemainingAfterYears % 30.44);

            System.out.print("Il vous reste à patienter encore ");

            if ( yearsBeforeMajority >= 1 ) {
                System.out.print(yearsBeforeMajority + " an(s) ");
            }

            if ( monthsBeforeMajority >= 1) {
                System.out.print(monthsBeforeMajority + " mois ");
            }

            if ( daysBeforeMajority >= 1 ) {
                System.out.print(daysBeforeMajority + " jour(s) ");
            }

            System.out.println("avant d'être majeur.");

        }

    }

}
