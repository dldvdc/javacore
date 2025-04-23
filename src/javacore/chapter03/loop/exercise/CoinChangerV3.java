package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {


        // Données de la transaction

        int totalBill  = 39;
        int amountPaid = 100;
        int amountDue  = amountPaid - totalBill;

        System.out.println("\nPour un total de " + totalBill + "€ vous avez donné " + amountPaid + "€");
        System.out.println("Le montant à vous rendre est de " + amountDue + "€\n");


        // Supports monétaires du distributeur:

        int billsOf50;
        int billsOf20;
        int billsOf10;
        int coinsOf2;
        int coinsOf1;


        // Calculs par support monétaire

        for ( billsOf50 = 0 ; amountDue >= 50 ; amountDue -= 50 ) {
            billsOf50++;
        }

        for ( billsOf20 = 0 ; amountDue >= 20 ; amountDue -= 20 ) {
            billsOf20++;
        }

        for ( billsOf10 = 0 ; amountDue >= 10 ; amountDue -= 10 ) {
            billsOf10++;
        }

        for ( coinsOf2 = 0 ; amountDue >= 2 ; amountDue -= 2 ) {
            coinsOf2++;
        }

        for ( coinsOf1 = 0 ; amountDue >= 1 ; amountDue -= 1 ) {
            coinsOf1++;
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
