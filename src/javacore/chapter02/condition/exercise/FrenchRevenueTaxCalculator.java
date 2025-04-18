package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {


        double taxRate = 0;
        double taxAmount = 0;

        double sliceLimit1 = 11294;
        double sliceLimit2 = 28797;
        double sliceLimit3 = 82341;
        double sliceLimit4 = 177106;


        // Valeurs à tester : 11294, 11295, 28797, 28798, 82341, 82342, 177106, 177107
        double salary = 179000;

        System.out.println("\nVotre salaire net imposable est de : " + salary + "€");


        // Application de l'abattement de 10%
        double adjustedSalary = salary - ( salary * 10.0 / 100 );
        System.out.println("Après abbatement de 10% votre salaire net imposable est de :: " + adjustedSalary + "€");


        // Calculs de l'Impôt sur le Revenu par tranches
        double taxableSalary = adjustedSalary;

        if ( taxableSalary > sliceLimit4 ) {
            taxRate = 45.0 / 100;
            taxAmount += (taxableSalary - sliceLimit4) * taxRate;
            taxableSalary = sliceLimit4;
        }
        if ( taxableSalary > sliceLimit3 ) {
            taxRate = 41.0 / 100;
            taxAmount += (taxableSalary - sliceLimit3) * taxRate;
            taxableSalary = sliceLimit3;
        }
        if ( taxableSalary > sliceLimit2 ) {
            taxRate = 30.0 / 100;
            taxAmount += (taxableSalary - sliceLimit2) * taxRate;
            taxableSalary = sliceLimit2;
        }
        if ( taxableSalary > sliceLimit1 ) {
            taxRate = 11.0 / 100;
            taxAmount += (taxableSalary - sliceLimit1) * taxRate;
        }


        // Calcul du pourcentage de l'Impot sur le Revenu par rapport au Salaire
        double totalTaxRate = taxAmount * 100 / salary;


        // Synthèse
        if (taxAmount > 0) {
            System.out.println("Votre Impôt sur le Revenu s'élève à " + taxAmount + "€ soit " + totalTaxRate  + "% de votre salaire.");
        }
        else {
            System.out.println("Vous êtes exonéré de l'Impôt sur le Revenu");
        }
    }
}
