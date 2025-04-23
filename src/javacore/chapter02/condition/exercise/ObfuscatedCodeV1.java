package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int vehiculeType = 1; // Type de véhicule (1 = Voiture, 2 = 4x4, 3 = Camion)

        double distanceKm = 100; // Distance

        boolean isDiesel = true;
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

        System.out.println("Ce trajet vous coûte : " +  price + "€");

    }

}
