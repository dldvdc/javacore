package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main(String[] args) {


        // Données relatives au salarié :

        String jobTitle = "Développeur";
        boolean isExecutive = true;
        int hourlyRate = 25;
        float dailyHoursWorked = 7.7f;
        byte workingDaysPerWeek = 5;
        byte workingWeeksPerMonth = 4;
        byte workingMonthsPerYear = 12;


        // Impots et Taxes :

        float socialContributionsRate = 25f / 100;
        float incomeTaxRate = 10.5f / 100;


        // Calcul du salaire brut journalier :
        float dailyGrossSalary = dailyHoursWorked * hourlyRate;

        // Calcul du salaire brut hebdomadaire :
        float weeklyGrossSalary = dailyHoursWorked * workingDaysPerWeek * hourlyRate;

        // Calcul du salaire brut mensuel :
        float monthlyGrossSalary = weeklyGrossSalary * workingWeeksPerMonth;

        // Calcul du salaire brut annuel :
        float yearlyGrossSalary = monthlyGrossSalary * workingMonthsPerYear;

        // Calcul du salaire net imposable mensuel :
        float monthlyNetSalary = monthlyGrossSalary - ( monthlyGrossSalary * socialContributionsRate );

        // Calcul du salaire net imposable annuel :
        float yearlyNetSalary = monthlyNetSalary * workingMonthsPerYear;

        // Calcul du salaire net mensuel, après impôt sur le revenu :
        float monthlyNetAfterTax = monthlyNetSalary - ( monthlyNetSalary * incomeTaxRate );

        // Calcul du salaire net annuel, après impôt sur le revenu :
        float yearlyNetAfterTax = monthlyNetAfterTax * workingMonthsPerYear;



        // Affichage de la Synthèse :

        System.out.println("Synthese Salariale : " + jobTitle + " (Cadre=" + isExecutive + ") :");
        System.out.println("Salaire brut journalier : " + dailyGrossSalary + "€.");
        System.out.println("Salaire brut hebdomadaire : " + weeklyGrossSalary + "€.");
        System.out.println("Salaire brut mensuel : " + monthlyGrossSalary + "€.");
        System.out.println("Salaire brut annuel : " + yearlyGrossSalary + "€.");
        System.out.println("Salaire net imposable mensuel : " + monthlyNetSalary + "€.");
        System.out.println("Salaire net imposable annuel : " + yearlyNetSalary + "€.");
        System.out.println("Salaire net mensuel, après impôt sur le revenu : " + monthlyNetAfterTax + "€.");
        System.out.println("Salaire net annuel, après impôt sur le revenu : " + yearlyNetAfterTax + "€.");

    }

}
