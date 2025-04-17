package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[] args) {


        //1 - Voyageur
        //2 - Valeurs à tester : 25, 26, 64, 65
        int age = 22;
        boolean isYoung = age <= 25;
        boolean isOld = age >= 65;


        //3 - Le Prix du billet
        //4 - Valeurs à tester : 0, 25.99, -6
        double price = 25.99;


        //5 - Calcul du tarif et des promotions
        if (price <= 0) {
            System.out.println("C'est votre jour de chance ! Aujourd'hui c'est gratuit !");
            price = 0;
        } else if (isYoung) {
            System.out.println("Vous bénéficiez d'un Forfait Jeune ! -25% !");
            price *= 0.75;
        } else if (isOld) {
            System.out.println("Vous bénéficiez d'un Forfait Señor ! -75% !");
            price *= 0.25;
        } else {
            System.out.println("Vous ne bénéficiez d'aucune réduction...");
        }

        System.out.println("Prix de votre billet de train : " + price + "€");
    }
}
