package javacore.chapter05.object.exercise;

public class LibraryBook {

    // 1

    String isbn;

    String title;
    String author;
    int publicationYear;

    boolean isAvailable;

    public void displayBookInformation() {

        String availabilityStatus = isAvailable ? "en rayon" : "emprunté";

        System.out.println("Livre n°" + isbn
                + " | Titre : \"" + title + "\""
                + " | Auteur : " + author
                + " | Année de publication : " + publicationYear
                + " | Statut : " + availabilityStatus);

    }

}
