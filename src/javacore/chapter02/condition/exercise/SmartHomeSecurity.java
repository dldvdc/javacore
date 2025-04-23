package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static void main(String[] args) {


        // Conditions d'activation du Security Mode

        boolean isHouseEmpty  = true;
        boolean isOwnerAsleep = false;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = true;


        // Verification des conditions d'activation

        boolean isSafeModeActivated = ( isHouseEmpty || isOwnerAsleep ) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        if ( isSafeModeActivated ) {
            System.out.println("Votre maison est en mode \"sécurisé\"");
        }
        else {
            System.out.println("Le mode \"sécurisé\" de votre maison est désactivé");
        }

    }

}
