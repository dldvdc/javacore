package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main(String[] args) {

        // Données relatives au salarié :
        String occupation = "Développeur";
        boolean isCadre = true;
        float hourAmount = 25;
        float weekWorkHours = 38.5f;

        // Calcul du salaire brut journalier :
        float dailyGrossSalary = (weekWorkHours / 5) * hourAmount;

        // Calcul du salaire brut hebdomadaire :
        float weeklyGrossSalary = weekWorkHours * hourAmount;

        // Calcul du salaire brut mensuel :
        float monthlyGrossSalary = weeklyGrossSalary * 4;

        // Calcul du salaire brut annuel :
        float yearlyGrossSalary = dailyGrossSalary * 365;

        // Calcul du salaire net imposable mensuel :
        float weeklyNetSalary = weeklyGrossSalary * 0.75f;

        // Calcul du salaire net mensuel, après impôt sur le revenu :
        float monthlyNetSalaryAfterTax = yearlyGrossSalary * 0.75f;

        // Calcul du salaire net annuel, après impôt sur le revenu :
        float yearlyNetSalaryAfterTax = yearlyGrossSalary * 0.75f;

        // Synthèse :
        System.out.println("Salaire brut journalier : " + dailyGrossSalary + "€.");
        System.out.println("Salaire brut hebdomadaire : " + weeklyGrossSalary + "€.");
        System.out.println("Salaire brut mensuel : " + monthlyGrossSalary + "€.");
        System.out.println("Salaire brut annuel : " + yearlyGrossSalary + "€.");
        System.out.println("Salaire net imposable mensuel : " + yearlyGrossSalary + "€.");
        System.out.println("Salaire net mensuel, après impôt sur le revenu : " + yearlyGrossSalary + "€.");
        System.out.println("Salaire net annuel, après impôt sur le revenu : " + yearlyGrossSalary + "€.");
    }
}
