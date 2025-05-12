package javacore.chapter05.object.exercise;

public class Pen {

    // 3
    String name;
    String color;
    double price;
    int quantity;
    String manufacturer;
    float weight;

    // 5
    public void displayInformation() {

        System.out.println("Nom : " + name + ", Couleur: " + color + ", Prix: " + price + "€, Quantité: " + quantity +
                ", Fabricant: " + manufacturer + ", Poids: " + weight + "g");

    }


    public static void main(String[] args) {

        // 1
        String name         = "Stylo";
        String color        = "Bleu";
        double price        = 2.5;
        int quantity        = 10;
        String manufacturer = "Bic";
        float weight        = 15f;


        // 2
        System.out.println("Nom : " + name + ", Couleur: " + color + ", Prix: " + price + "€, Quantité: " + quantity +
                           ", Fabricant: " + manufacturer + ", Poids: " + weight + "g");

        // 4
        Pen pen = new Pen();
        pen.name = "Stylo";
        pen.color = "Bleu";
        pen.price = 2.5;
        pen.quantity = 10;
        pen.manufacturer = "Bic";
        pen.weight = 15f;

        // 6
        pen.displayInformation();

    }

}
