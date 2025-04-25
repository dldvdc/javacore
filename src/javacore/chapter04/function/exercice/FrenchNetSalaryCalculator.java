package javacore.chapter04.function.exercice;

public class FrenchNetSalaryCalculator {

    public static void main(String[] args) {


        final double SOCIAL_CHARGE_PERCENTAGE = 23;

        final double TAX_ALLOWANCE_PERCENTAGE = 10;


        // 11,07€ / heure (SMIC Français en 2022)
        displaySalaryAndTaxInformation (11.07, SOCIAL_CHARGE_PERCENTAGE, TAX_ALLOWANCE_PERCENTAGE);

        // 17,50€ / heure (Salaire Médian Français en 2022)
        displaySalaryAndTaxInformation (17.5, SOCIAL_CHARGE_PERCENTAGE, TAX_ALLOWANCE_PERCENTAGE);

        // 22,50€ / heure (Salaire Moyen Français en 2022)
        displaySalaryAndTaxInformation (22.5, SOCIAL_CHARGE_PERCENTAGE, TAX_ALLOWANCE_PERCENTAGE);

        // 35,00€ / heure (Seuil de richesse Français en 2022 pour une personne seule)
        displaySalaryAndTaxInformation (35, SOCIAL_CHARGE_PERCENTAGE, TAX_ALLOWANCE_PERCENTAGE);

    }


    // 1

    public static double calculateAnnualGrossSalary(double hourlyGrossSalary) {

        float dailyHoursWorked = 7.7f;
        byte workingDaysPerWeek = 5;
        byte workingWeeksPerMonth = 4;
        byte workingMonthsPerYear = 12;

        double dailyGrossSalary = hourlyGrossSalary * dailyHoursWorked;
        double weeklyGrossSalary = dailyGrossSalary * workingDaysPerWeek;
        double monthlyGrossSalary = weeklyGrossSalary * workingWeeksPerMonth;

        return monthlyGrossSalary * workingMonthsPerYear;

    }


    // 2

    public static double applySocialCharges(double annualGrossSalary, double socialChargePercentage) {

        return annualGrossSalary - annualGrossSalary * socialChargePercentage / 100;

    }


    // 3

    public static double applyTaxAllowance(double annualNetSalary, double taxAllowancePercentage) {

        return annualNetSalary - annualNetSalary * taxAllowancePercentage / 100;

    }


    // 4

    public static double applyRevenueTax(double annualNetSalary) {

        // Tranches d'imposition

        double bracket1UpperLimit = 11294;

        double bracket2Rate = 0.11;
        double bracket2UpperLimit = 28797;

        double bracket3Rate = 0.30;
        double bracket3UpperLimit = 82341;

        double bracket4Rate = 0.41;
        double bracket4UpperLimit = 177106;

        double bracket5Rate = 0.45;


        // Calcul de l'Impôt par tranche

        double taxAmount = 0;
        double taxableSalary = annualNetSalary;


        if ( taxableSalary > bracket4UpperLimit ) {

            taxAmount += (taxableSalary - bracket4UpperLimit) * bracket5Rate;
            taxableSalary = bracket4UpperLimit;

        }

        if ( taxableSalary > bracket3UpperLimit ) {

            taxAmount += (taxableSalary - bracket3UpperLimit) * bracket4Rate;
            taxableSalary = bracket3UpperLimit;

        }

        if ( taxableSalary > bracket2UpperLimit ) {

            taxAmount += (taxableSalary - bracket2UpperLimit) * bracket3Rate;
            taxableSalary = bracket2UpperLimit;

        }

        if ( taxableSalary > bracket1UpperLimit ) {

            taxAmount += (taxableSalary - bracket1UpperLimit) * bracket2Rate;

        }

        return annualNetSalary - taxAmount;

    }


    // 5 - Fonction d'affichage de la synthèse

    public static void displaySalaryAndTaxInformation (double hourlyGrossSalary, double socialChargePercentage,
                                                       double taxAllowancePercentage) {

        System.out.println("\nPour un taux horaire de " + hourlyGrossSalary + "€/heure : \n");

        // 1
        double annualGrossSalary = calculateAnnualGrossSalary(hourlyGrossSalary);
        System.out.println("Votre salaire annuel brut est de " + annualGrossSalary + "€");

        // 2
        double annualNetSalary = applySocialCharges(annualGrossSalary, socialChargePercentage);
        System.out.println("Votre salaire annuel net est de " + annualNetSalary + "€");

        // 3
        annualNetSalary = applyTaxAllowance(annualNetSalary, taxAllowancePercentage);
        System.out.println("Votre salaire annuel net après abbâtement est de " + annualNetSalary + "€");

        // 4
        double netSalaryAfterTax = applyRevenueTax(annualNetSalary);
        System.out.println("Votre Impot sur le Revenu s'élèce à " + ( annualNetSalary - netSalaryAfterTax ) + "€");
        System.out.println("Votre salaire annuel net d'impôt est donc de " + netSalaryAfterTax + "€\n\n" );

    }

}