package javacore.chapter04.function.exercice;

public class CoinChangerV4 {

    public static void main(String[] args) {

        makeTransaction(36, 200);

    }

    public static void makeTransaction(int totalBill, int amountPaid) {

        // Supports monétaires disponibles:

        int billsOf50Available = 12;
        int billsOf20Available = 4;
        int billsOf10Available = 8;
        int coinsOf2Available  = 12;
        int coinsOf1Available  = 15;

        displayMoneySupportsAvailable(billsOf50Available, billsOf20Available, billsOf10Available, coinsOf2Available, coinsOf1Available);

        // Processus de distribution

        System.out.println("\n\n################## - Process de Transaction - ##################\n");
        System.out.println("Pour un total de " + totalBill + "€ vous avez payé " + amountPaid + "€");

        int amountDue  = amountPaid - totalBill;

        System.out.println("Le montant à vous rendre est de " + amountDue + "€\n");
        System.out.println("Vous recuperez : \n");

        int billsOf50Due = giveChange(amountDue, billsOf50Available, 50, " billet(s) de 50€");
        amountDue = updateAmountDue(amountDue, 50, billsOf50Due);


        int billsOf20Due = giveChange(amountDue, billsOf20Available, 20, " billet(s) de 20€");
        amountDue = updateAmountDue(amountDue, 20, billsOf20Due);


        int billsOf10Due = giveChange(amountDue, billsOf10Available, 10, " billet(s) de 10€");
        amountDue = updateAmountDue(amountDue, 10, billsOf10Due);


        int coinsOf2Due = giveChange(amountDue, coinsOf2Available, 2, " pièce(s) de 2€");
        amountDue = updateAmountDue(amountDue, 2, coinsOf2Due);


        int coinsOf1Due = giveChange(amountDue, coinsOf1Available, 2, " pièce(s) de 1€");
        amountDue = updateAmountDue(amountDue, 1, coinsOf1Due);

        if (amountDue == 0) System.out.println("\nMerci");


        billsOf50Available = updateMoneySupportStock(billsOf50Available, billsOf50Due);
        billsOf20Available = updateMoneySupportStock(billsOf20Available, billsOf20Due);
        billsOf10Available = updateMoneySupportStock(billsOf10Available, billsOf10Due);
        coinsOf2Available = updateMoneySupportStock(coinsOf2Available, coinsOf2Due);
        coinsOf1Available = updateMoneySupportStock(coinsOf1Available, coinsOf1Due);

        System.out.println("\n################################################################\n");

        displayMoneySupportsAvailable(billsOf50Available, billsOf20Available, billsOf10Available, coinsOf2Available, coinsOf1Available);

    }

    public static void displayMoneySupportsAvailable(int billsOf50Available, int billsOf20Available, int billsOf10Available,
                                                     int coinsOf2Available, int coinsOf1Available) {

        System.out.println("\n\n ---- Billets et pièces disponibles dans le distributeur ----\n");

        System.out.print(billsOf50Available + " billet(s) de 50€ | ");
        System.out.print(billsOf20Available + " billet(s) de 20€ | ");
        System.out.print(billsOf10Available + " billet(s) de 10€ \n");
        System.out.print(coinsOf2Available  + " pièce(s) de 2€ | ");
        System.out.print(coinsOf1Available  + " pièce(s) de 1€ \n\n");

    }

    // Fonctions de Calcul

    public static int giveChange(int amountDue, int moneySupportAvailable, int moneySupportValue, String moneySupportName) {

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


    public static int updateMoneySupportStock(int moneySupportAvailable, int moneySupportDue) {

            moneySupportAvailable -= moneySupportDue;

            return moneySupportAvailable;

    }

}