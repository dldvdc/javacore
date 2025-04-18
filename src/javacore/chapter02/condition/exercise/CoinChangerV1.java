package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {
    public static void main(String[] args) {


        // Données de la transaction

        int totalBill = 39;
        int amountPaid = 100;
        int amountDue = amountPaid - totalBill;
        System.out.println("\nPour un total de " + totalBill + "€ vous avez donné " + amountPaid + "€");

        System.out.println("Le montant à vous rendre est de " + amountDue + "€\n");


        // Supports monétaires du distributeur:

        int billsOf50 = 0;
        int billsOf20 = 0;
        int billsOf10 = 0;
        int coinsOf2 = 0;
        int coinsOf1 = 0;


        // Calculs par support monétaire

        if (amountDue >= 50) {
            billsOf50 = amountDue / 50;
            amountDue -= billsOf50 * 50;
        }
        if (amountDue >= 20) {
            billsOf20 = amountDue / 20;
            amountDue -= billsOf20 * 20;
        }
        if (amountDue >= 10) {
            billsOf10 = amountDue / 10;
            amountDue -= billsOf10 * 10;
        }
        if (amountDue >= 2) {
            coinsOf2 = amountDue / 2;
            amountDue -= coinsOf2 * 2;
        }
        if (amountDue >= 1) {
            coinsOf1 = amountDue / 1;
            amountDue -= coinsOf1 * 1;
        }


        // Processus de distribution

        System.out.println("--- Le distributeur vous rend :\n");

        if ( billsOf50 > 0 ) {
            System.out.println(billsOf50 + " billet(s) de 50€");
        }
        if ( billsOf20 > 0 ) {
            System.out.println(billsOf20 + " billet(s) de 20€");
        }
        if ( billsOf10 > 0 ) {
            System.out.println(billsOf10 + " billet(s) de 10€");
        }
        if ( coinsOf2 > 0 ) {
        System.out.println(coinsOf2 + " pièce(s) de 2€");
        }
        if ( coinsOf1 > 0 ) {
            System.out.println(coinsOf1 + " pièce(s) de 1€");
        }

    }
}
