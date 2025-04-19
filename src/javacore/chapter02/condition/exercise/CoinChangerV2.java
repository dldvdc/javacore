package javacore.chapter02.condition.exercise;

public class CoinChangerV2 {
    public static void main(String[] args) {


        // Données de la transaction

        int totalBill  = 36;
        int amountPaid = 200;
        int amountDue  = amountPaid - totalBill;

        System.out.println("\nPour un total de " + totalBill + "€ vous avez donné " + amountPaid + "€");

        System.out.println("Le montant à vous rendre est de " + amountDue + "€\n");


        // Supports monétaires du distributeur disponibles:

        int billsOf50 = 1;
        int billsOf20 = 4;
        int billsOf10 = 8;
        int coinsOf2  = 12;
        int coinsOf1  = 15;


        int billsOf50Due = 0;
        int billsOf20Due = 0;
        int billsOf10Due = 0;
        int coinsOf2Due  = 0;
        int coinsOf1Due  = 0;



        // Calculs par support monétaire

        if ( amountDue >= 50 ) {
            if ( amountDue / 50 <= billsOf50 ) {
                billsOf50Due = amountDue / 50;
            } else {
                billsOf50Due = billsOf50;
            }
            amountDue -= billsOf50Due * 50;
            billsOf50 -= billsOf50Due;
        }

        if ( amountDue >= 20 ) {
            if ( amountDue / 20 <= billsOf20 ) {
                billsOf20Due = amountDue / 20;
            } else {
                billsOf20Due = billsOf20;
            }
            amountDue -= billsOf20Due * 20;
            billsOf20 -= billsOf20Due;
        }

        if ( amountDue >= 10 ) {
            if ( amountDue / 10 <= billsOf10 ) {
                billsOf10Due = amountDue / 10;
            } else {
                billsOf10Due = billsOf10;
            }
            amountDue -= billsOf10Due * 10;
            billsOf10 -= billsOf10Due;
        }

        if ( amountDue >= 2 ) {
            if ( amountDue / 2 <= coinsOf2 ) {
                coinsOf2Due = amountDue / 2;
            } else {
                coinsOf2Due = coinsOf2;
            }
            amountDue -= coinsOf2Due * 2;
            coinsOf2 -= coinsOf2Due;
        }

        if ( amountDue >= 1 ) {
            if ( amountDue / 1 <= coinsOf1 ) {
                coinsOf1Due = amountDue / 1;
            } else {
                coinsOf1Due = coinsOf1;
            }
            amountDue -= coinsOf1Due * 1;
            coinsOf1 -= coinsOf1Due;
        }


        // Processus de distribution

        System.out.println("--- Le distributeur vous rend :\n");

        if ( billsOf50Due > 0 ) {
            System.out.println(billsOf50Due + " billet(s) de 50€");
        }
        if ( billsOf20Due > 0 ) {
            System.out.println(billsOf20Due + " billet(s) de 20€");
        }
        if ( billsOf10Due > 0 ) {
            System.out.println(billsOf10Due + " billet(s) de 10€");
        }
        if ( coinsOf2Due > 0 ) {
            System.out.println(coinsOf2Due + " pièce(s) de 2€");
        }
        if ( coinsOf1Due > 0 ) {
            System.out.println(coinsOf1Due + " pièce(s) de 1€");
        }


        // Supports monétaires disponibles après transaction

        System.out.println("\n\n--- Billets et pièces disponibles dans le distributeur :\n");
        System.out.println(billsOf50 + " billet(s) de 50€");
        System.out.println(billsOf20 + " billet(s) de 20€");
        System.out.println(billsOf10 + " billet(s) de 10€");
        System.out.println(coinsOf2 + " pièce(s) de 2€");
        System.out.println(coinsOf1 + " pièce(s) de 1€");

    }
}
