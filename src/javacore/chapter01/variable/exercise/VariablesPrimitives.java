package javacore.chapter01.variable.exercise;

public class VariablesPrimitives {
    public static void main(String[] args) {

        long isbn = 9782123456789L;
        short pageCount = 248;
        float averageRating = 4.2F;
        boolean isAvailable = true;
        int totalUsers = 1504;
        double dueAmount = 112.36;
        int userId = 85;

        System.out.println("\nDonnées du livre :");
        System.out.println("ISBN : " + isbn);
        System.out.println("Nombre de pages : " + pageCount);
        System.out.println("Note Moyenne : " + averageRating + "/5");
        System.out.println("Disponible : " + isAvailable);

        System.out.println("\nDonnées Utilisateur n°" + userId + " / " + totalUsers + " : ");
        System.out.println("Pénalités : " + dueAmount + "€");


    }
}
