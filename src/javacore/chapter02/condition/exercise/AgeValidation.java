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

        System.out.println("\nNous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);

        /**
         * Fin d'un code que nous ne comprenons pas, mais dont nous pouvons utiliser les variables !
         */


        // Donnée de l'utilisateur :

        int birthDay = 18;
        int birthMonth = 4;
        int birthYear = 2007;
        String birthDate = birthDay + "/" + birthMonth + "/" + birthYear;

        System.out.println("Vous êtes né le " + birthDate);



        // Calcul de l'âge de l'utilisateur :

        int age = currentYear - birthYear;

        if ( currentMonth == birthMonth && currentDay < birthDay || currentMonth < birthMonth ) {
            age--;
        }


        // Implémentation de la majorité

        if ( age >= 18) {
            System.out.println("Vous êtes majeur !");
        } else {
            System.out.println("Vous êtes mineur...");
        }

    }

}
