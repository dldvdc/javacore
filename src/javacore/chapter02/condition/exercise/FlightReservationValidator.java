package javacore.chapter02.condition.exercise;

public class FlightReservationValidator {

    public static void main(String[] args) {


        // Données relatives à l'utilisateur :

        boolean isLoggedIn = false; // L'utilisateur est-il connecté

        int age = 15; // Age de l'utilisateur

        boolean isPremiumMember = true; // Est-ce l'utilisateur est membre Premium



        // Données relatives au vol sélectionné :

        int seatsAvailable = 10; // Nombre de sièges disponibles

        boolean isVipFlight = false; // Est-ce que le vol est réservé aux VIP



        // Gestion de la réservation

        if ( isLoggedIn && age >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {

            System.out.println("Résevation effectuée avec succès");
            seatsAvailable--;

        }

        else {

            if (!isLoggedIn) {
                System.out.println("Réservation impossible, vous êtes déconnecté");
            }
            else if (age < 18) {
                System.out.println("Réservation impossible, vous êtes mineur");
            }
            else if ( seatsAvailable < 1 ) {
                System.out.println("Réservation impossible, ce vol est complet");
            }
            else if ( isVipFlight && !isPremiumMember) {
                System.out.println("Réservation impossible, ce vol est VIP");
            }

        }

    }

}