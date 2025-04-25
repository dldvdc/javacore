package javacore.chapter04.function.project.refactor;

public class FunctionRefactorObfuscatedCodeV1 {



    public static void main(String[] args) {

        double tripPrice = getTripPrice(1, 600, true);

        System.out.println("Ce trajet vous coûte : " +  tripPrice + "€");

    }

    public static double getTripPrice( int vehiculeType, double distanceKm, boolean isDiesel ) {

        double discount = 0.03;

        double  price = 0;

        if (vehiculeType == 1) {
            price = distanceKm * 0.10;
        }
        if (vehiculeType == 2) {
            price = distanceKm * 0.20;
        }
        if (vehiculeType == 3) {
            price = distanceKm * 0.35;
        }
        if (isDiesel) {
            price =  price - (distanceKm * discount);
        }

        return price;

    }

}
