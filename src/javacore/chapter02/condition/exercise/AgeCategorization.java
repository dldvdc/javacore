package javacore.chapter02.condition.exercise;

public class AgeCategorization {

    public static void main(String[] args) {


        // Declaration de l'age

        // Valeurs à tester : 9, 10, 17, 18, 24, 25, 65, 66
        int age = 612;

        System.out.println("\nVous avez " + age + " ans" );


        // Attribution de la categorie

        String categoryMessage= "Vous appartenez à la catégorie des ";

        if ( age < 10 ) {
            System.out.println(categoryMessage + "Enfants");
        }
        else if ( age > 65) {
            System.out.println(categoryMessage + "Seniors");
        }
        else if ( age < 18) {
            System.out.println(categoryMessage + "Adolescents");
        }
        else if ( age < 25) {
            System.out.println(categoryMessage + "Jeunes Adultes");
        }
        else {
            System.out.println(categoryMessage + "Adultes");
        }

    }

}