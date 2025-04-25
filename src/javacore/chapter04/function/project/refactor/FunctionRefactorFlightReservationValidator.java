package javacore.chapter04.function.project.refactor;

public class FunctionRefactorFlightReservationValidator {

    public static void main(String[] args) {

        checkFlightReservation(true, 25, false);

    }

    public static boolean checkFlightReservation(boolean isLoggedIn, int userAge, boolean isPremiumMember) {


        // Données relatives au vol sélectionné :

        int seatsAvailable = 10;

        boolean isVipFlight = false;


        // Gestion de la réservation

        if (isLoggedIn && userAge >= 18 && seatsAvailable > 0 && (!isVipFlight || isPremiumMember)) {

            System.out.println("\nRésevation effectuée avec succès");
            seatsAvailable--;

            return true;

        } else {

            if (!isLoggedIn) {
                System.out.println("Réservation impossible, vous êtes déconnecté");
            } else if (userAge < 18) {
                System.out.println("Réservation impossible, vous êtes mineur");
            } else if (seatsAvailable < 1) {
                System.out.println("Réservation impossible, ce vol est complet");
            } else if (isVipFlight && !isPremiumMember) {
                System.out.println("Réservation impossible, ce vol est VIP");
            }

            return false;

        }

    }

}
