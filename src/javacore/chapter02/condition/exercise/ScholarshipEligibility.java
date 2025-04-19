package javacore.chapter02.condition.exercise;

public class ScholarshipEligibility {
    public static void main(String[] args) {


        // Donnée de l'étudiant :

        float studentGpa = 4F;
        double householdIncome = 25000;
        boolean hasExtracurricular = true;


        // Donnée globales :

        double minIncome = 40000;
        double maxIncome = 60000;

        float minGpa = 3.5F;

        // Calcul d'éligibilité


        boolean hasBasicEligibility = studentGpa >= minGpa && hasExtracurricular;


        if ( hasBasicEligibility && householdIncome < minIncome ) {
            System.out.println("\nVous êtes éligible à une bourse pleine");
        }

        else if ( hasBasicEligibility && householdIncome < maxIncome ) {
            System.out.println("\nVous êtes éligible à une bourse partielle");
        }

        else {
            System.out.println("\nVous n'êtes éligible à aucune bourse");
        }

    }
}
