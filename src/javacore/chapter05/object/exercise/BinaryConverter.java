package javacore.chapter05.object.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryConverter {

    public static final int BINARY_BASE = 2;

    public static void main(String[] args) {

        // 1
        String binaryText = "10110110";

        // 2
        System.out.println(BinaryConverter.convertBinaryToDecimal(binaryText));

        // 3
        String testBinaryText = "1011001010110111101011001001011010101001011111010111001010101101";
        System.out.println(BinaryConverter.convertBigBinaryToDecimal(testBinaryText));

        // 4
        String userBinaryText = BinaryConverter.getBinaryTextFromUser();

        // C'est en effet plus clair en spécifiant 64, 53 étant apparemment une limitation de la précision pour un double...
        if (userBinaryText.length() > 64) {
            System.out.println(BinaryConverter.convertBigBinaryToDecimal(userBinaryText));
        }
        else {
            System.out.println(BinaryConverter.convertBinaryToDecimal(userBinaryText));
        }



    }


    // 2
    public static double convertBinaryToDecimal(String binaryText) {

        double exponent = 0;
        double result = 0;

        for (int i = binaryText.length() - 1 ; i >= 0 ; i--) {

            char c = binaryText.charAt(i);
            int bit = Integer.parseInt(String.valueOf(c));
            result += bit * Math.pow(BINARY_BASE, exponent);
            exponent++;

        }

        return result;

    }


    // 3
    public static BigInteger convertBigBinaryToDecimal(String binaryText) {

        BigInteger result = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(BINARY_BASE);
        BigInteger power = BigInteger.ONE;

        for (int i = binaryText.length() - 1; i >= 0; i--) {

            char c = binaryText.charAt(i);

            int bit = Integer.parseInt(String.valueOf(c));

            if (bit == 1) {
                result = result.add(power);
            }

            power = power.multiply(base);

        }

        return result;

    }


    // 4
    public static String getBinaryTextFromUser() {

        Scanner scanner = new Scanner(System.in);

        final int MAX_ATTEMPTS = 5;
        int userAttempts = 0;

        do {

            System.out.print("Saisissez un nombre binaire à convertir : ");
            String userBinaryText = scanner.nextLine().trim();

            boolean isValid = true;

            for (int i = 0; i < userBinaryText.length(); i++) {
                if (userBinaryText.charAt(i) != '0' && userBinaryText.charAt(i) != '1') {
                    isValid = false;
                    break;
                }
            }

            if (isValid && !userBinaryText.isEmpty()) {
                return userBinaryText;
            }
            else {
                System.out.println("Entrée invalide : seuls 0 ou 1 sont autorisés.");
                userAttempts++;
            }

        } while (userAttempts <= MAX_ATTEMPTS);

        return "0";

    }

}
