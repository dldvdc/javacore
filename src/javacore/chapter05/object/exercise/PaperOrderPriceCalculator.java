package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class PaperOrderPriceCalculator {


    // Propriétés Statiques

    static final int MIN_SHEETS_ORDER = 200;
    static final int MAX_SHEETS_ORDER = 200000;

    static final double PRICE_PER_SHEET_TIER1 = 0.01;
    static final int TIER1_MAX_SHEETS = 10_000;
    static final double PRICE_PER_SHEET_TIER2 = 0.005;
    static final int TIER2_MAX_SHEETS = 30_000;
    static final double PRICE_PER_SHEET_TIER3 = 0.0025;

    static final double SHIPPING_FEE = 9.99;
    static final double FREE_SHIPPING_MIN_TOTAL = 200.0;

    static final double VAT_RATE = 0.20;


    // Propriétés d'instances

    private final int orderedSheetQuantity;
    private final double finalInvoiceAmount;


    // Contructeur(s)

    public PaperOrderPriceCalculator(int orderedSheetQuantity) {
        this.orderedSheetQuantity = orderedSheetQuantity;
        this.finalInvoiceAmount = this.calculateFinalInvoice();
    }


    // Méthodes Statiques

    public static void main(String[] arg) {

       int orderedSheetQuantity = promptCustomerForOrder();

        if ( orderedSheetQuantity > 0 ) {
            PaperOrderPriceCalculator orderCalculator = new PaperOrderPriceCalculator(orderedSheetQuantity);
            System.out.println("\nLe devis de votre commande de " + orderCalculator.orderedSheetQuantity
                            + " feuilles s'élève à " + String.format("%.2f", orderCalculator.finalInvoiceAmount) + "€.");
        }

    }

    public static int promptCustomerForOrder() {

        Scanner sc = new Scanner(System.in);
        int attemptCount = 0;
        boolean isValidOrder = false;

        System.out.println("\n######## Bienvenu chez Dunder Mifflin ########\n");

        while (!isValidOrder && attemptCount < 5) {

            System.out.print("Combien de feuilles souhaitez-vous commander ? ");
            int orderedSheetsCount = sc.nextInt();
            sc.nextLine();

            if (orderedSheetsCount < MIN_SHEETS_ORDER) {
                System.out.println("Nous sommes désolés mais la commande minimum est de " + MIN_SHEETS_ORDER + " feuilles.\n");
            }
            else if (orderedSheetsCount > MAX_SHEETS_ORDER) {
                System.out.println("Nous sommes désolés mais la commande maximum est de " + MAX_SHEETS_ORDER + " feuilles.\n");
            }
            else {
                sc.close();
                return orderedSheetsCount;
            }

            attemptCount++;
        }

        if (!isValidOrder) {
            System.out.println("\nNombre de tentatives exagérées : Revenez nous voir plus tard");
        }

        sc.close();
        return 0;

    }


    // Méthodes d'instances

    public double calculateFinalInvoice() {

        double invoiceAmount = calculateBasePrice();
        invoiceAmount = addShippingFeeIfApplicable(invoiceAmount);

        return applyVatRate(invoiceAmount);

    }

    public double calculateBasePrice() {

        double price = 0;
        int remainingSheets = this.orderedSheetQuantity;

        if (remainingSheets > TIER2_MAX_SHEETS) {
            int tierQty = remainingSheets - TIER2_MAX_SHEETS;
            price += tierQty * PRICE_PER_SHEET_TIER3;
            remainingSheets -= tierQty;
        }

        if (remainingSheets >	TIER1_MAX_SHEETS) {
            int tierQty = remainingSheets - TIER1_MAX_SHEETS;
            price += tierQty * PRICE_PER_SHEET_TIER2;
            remainingSheets -= tierQty;
        }

        price += remainingSheets * PRICE_PER_SHEET_TIER1;

        return price;

    }

    public double addShippingFeeIfApplicable(double price) {
        return price < FREE_SHIPPING_MIN_TOTAL ? price + SHIPPING_FEE : price;
    }

    public double applyVatRate(double price) {
        return price + (price * VAT_RATE);
    }

}
