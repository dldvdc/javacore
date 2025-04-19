package javacore.chapter02.condition.practice;

public class PracticeOperatorLogical {

    public static void main(String[] args) {

        boolean trueAndTrue   =  true && true;  // true
        boolean trueAndFalse  =  true && false; // false
        boolean falseAndTrue  = false && true;  // false
        boolean falseAndFalse = false && false; // false

        boolean trueOrTrue   =  true || true;  // true
        boolean trueOrFalse  =  true || false; // true
        boolean falseOrTrue  = false || true;  // true
        boolean falseOrFalse = false || false; // false

        boolean notTrue  = !true;  //false
        boolean notFalse = !false; // true

        boolean trueAndTrueAndTrue  = true && true && true;  // true
        boolean trueAndTrueAndFalse = true && true && false; // false

        boolean trueOrTrueOrTrue  = true || true || true;  // true
        boolean trueOrTrueOrFalse = true || true || false; // true

        boolean notNotTrue  = !!true;  // true
        boolean notNotFalse = !!false; // false



        boolean isLoggedIn = false; // L'utilisateur est-il connecté

        int age = 15; // Age de l'utilisateur

        int seatsAvailable = 10; // Nombre de sièges disponibles

        boolean isPremiumMember = true; // Est-ce l'utilisateur est membre Premium

        boolean isVipFlight = false; // Est-ce que le vol est réservé aux VIP


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
