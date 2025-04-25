package javacore.chapter04.function.exercice;

public class CoinChangerV4 {

    public static void main(String[] args) {


        // Données de la transaction

        int totalBill  = 36;
        int amountPaid = 200;
        int amountDue  = amountPaid - totalBill;

        System.out.println("\nPour un total de " + totalBill + "€ vous avez payé " + amountPaid + "€");
        System.out.println("Le montant à vous rendre est de " + amountDue + "€\n");


        // Supports monétaires du distributeur disponibles:

        int billsOf50Available = 12;
        int billsOf20Available = 4;
        int billsOf10Available = 8;
        int coinsOf2Available  = 12;
        int coinsOf1Available  = 15;


        // Processus de distribution

        System.out.println("Le Distributeur vous rend :");

        int billsOf50Due = changeMoneySupport(amountDue, billsOf50Available, 50, " billet(s) de 50€");
        amountDue = updateAmountDue(amountDue, 50, billsOf50Due);


        int billsOf20Due = changeMoneySupport(amountDue, billsOf20Available, 20, " billet(s) de 20€");
        amountDue = updateAmountDue(amountDue, 20, billsOf20Due);


        int billsOf10Due = changeMoneySupport(amountDue, billsOf10Available, 10, " billet(s) de 10€");
        amountDue = updateAmountDue(amountDue, 10, billsOf10Due);


        int coinsOf2Due = changeMoneySupport(amountDue, coinsOf2Available, 2, " pièce(s) de 2€");
        amountDue = updateAmountDue(amountDue, 2, coinsOf2Due);


        int coinsOf1Due = changeMoneySupport(amountDue, coinsOf1Available, 2, " pièce(s) de 1€");
        amountDue = updateAmountDue(amountDue, 1, coinsOf1Due);



        System.out.println("\n\n--- Billets et pièces disponibles dans le distributeur :\n");

        billsOf50Available = updateMoneySupportStock(billsOf50Available, billsOf50Due, " billet(s) de 50€");
        billsOf20Available = updateMoneySupportStock(billsOf20Available, billsOf20Due," billet(s) de 20€");
        billsOf10Available = updateMoneySupportStock(billsOf10Available, billsOf10Due, " billet(s) de 10€");
        coinsOf2Available = updateMoneySupportStock(coinsOf2Available, coinsOf2Due, " pièce(s) de 2€");
        coinsOf1Available = updateMoneySupportStock(coinsOf1Available, coinsOf1Due, " pièce(s) de 1€");

    }


    // Fonctions de Calcul

    public static int changeMoneySupport(int amountDue, int moneySupportAvailable, int moneySupportValue, String moneySupportName) {

        int moneySupportDue = 0;

        if (amountDue >= moneySupportValue) {

            if (amountDue / moneySupportValue <= moneySupportAvailable) {
                moneySupportDue = amountDue / moneySupportValue;
            }
            else {
                moneySupportDue = moneySupportAvailable;
            }

            System.out.println(moneySupportDue + moneySupportName);

        }

        return moneySupportDue;

    }


    public static int updateAmountDue(int amountDue, int moneySupportValue, int moneySupportDue) {

        amountDue -= moneySupportDue * moneySupportValue;

        return amountDue;

    }


    public static int updateMoneySupportStock(int moneySupportAvailable, int moneySupportDue, String moneySupportName) {

            moneySupportAvailable -= moneySupportDue;
            System.out.println(moneySupportAvailable + moneySupportName);

            return moneySupportAvailable;

    }

}