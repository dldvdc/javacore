package javacore.chapter05.object.exercise;

public class ProductSorting {

    public String name;
    public String category;

    public double price;
    public char currency;


    public ProductSorting(String name, String category, double price, char currency) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }


    public void displayProduct() {
        System.out.println("Product Name : " + this.name
                + " | Category : " + this.category
                + " | Price : " + this.price + this.currency);
    }


    public static void main(String[] args) {

        ProductSorting[] productArray = generateFakeProductList();

        // Je n'arrive pas à faire une copie safe de l'instance pour éviter de modifier l'originale... valeurs référence
        ProductSorting[] sortedProducts = sortProductArray(productArray);

        for (ProductSorting product : sortedProducts) {
            product.displayProduct();
        }

    }


    public static ProductSorting[] generateFakeProductList() {

        ProductSorting[] productArray = new ProductSorting[10];

        productArray[0] = new ProductSorting("Samsung G9", "Gaming Screen", 1499.99, '$');
        productArray[1] = new ProductSorting("Porsche 911", "Car", 120000, '€');
        productArray[2] = new ProductSorting("IKEA Sofa", "Seating", 599.99, '£');
        productArray[3] = new ProductSorting("MacBook Pro M3", "Laptop", 2499.99, '$');
        productArray[4] = new ProductSorting("Rolex Submariner", "Watch", 9500, '€');
        productArray[5] = new ProductSorting("Bose QuietComfort 45", "Headphones", 329.99, '$');
        productArray[6] = new ProductSorting("Dyson V15 Detect", "Vacuum Cleaner", 7390.10, '¥');
        productArray[7] = new ProductSorting("Harley-Davidson Fat Boy", "Motorcycle", 20300, '€');
        productArray[8] = new ProductSorting("Canon EOS R5", "Camera", 3899, '$');
        productArray[9] = new ProductSorting("Lego Millennium Falcon", "Toy", 849.99, '$');

        return productArray;

    }


    public static ProductSorting[] sortProductArray (ProductSorting[] productArray) {

        // Je n'arrive pas à faire une copie safe de l'instance pour éviter de modifier l'originale... valeur référence
        ProductSorting[] sortedProductArray = productArray;

        for (int currentProductIndex = 0; currentProductIndex < sortedProductArray.length ; currentProductIndex++) {

            int mostExpensiveProductIndex = currentProductIndex;

            for (int nextProductIndex = currentProductIndex + 1; nextProductIndex < sortedProductArray.length ; nextProductIndex++) {

                if (sortedProductArray[nextProductIndex].getPriceInDollar() > sortedProductArray[mostExpensiveProductIndex].getPriceInDollar()) {
                    mostExpensiveProductIndex = nextProductIndex;
                }
            }

            ProductSorting currentProduct = sortedProductArray[currentProductIndex];
            sortedProductArray[currentProductIndex] = sortedProductArray[mostExpensiveProductIndex];
            sortedProductArray[mostExpensiveProductIndex] = currentProduct;

        }

        return sortedProductArray;

    }

    public static double convertEuroToDollar(double amountInEuro) {
        final double EURO_TO_DOLLAR_RATE = 0.95;
        return amountInEuro * EURO_TO_DOLLAR_RATE;
    }

    public static double convertYuanToDollar(double amountInYuan) {
        final double YUAN_TO_DOLLAR_RATE = 0.14;
        return amountInYuan * YUAN_TO_DOLLAR_RATE;
    }

    public static double convertPoundToDollar(double amountInPound) {
        final double POUND_TO_DOLLAR_RATE = 0.79;
        return amountInPound *POUND_TO_DOLLAR_RATE;
    }

    public double getPriceInDollar() {

        return switch (this.currency) {
            case '€' -> convertEuroToDollar(this.price);
            case '¥' -> convertYuanToDollar(this.price);
            case '£' -> convertPoundToDollar(this.price);
            default -> this.price;

        };
    }
}
