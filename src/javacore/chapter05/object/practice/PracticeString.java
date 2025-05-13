package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeString {

    public static void main(String[] args) {

        // String Pool
        String hello1 = "Bonjour";
        String hello2 = "Bonjour";

        System.out.println(hello1 == hello2); // true

        String hello3 = new String("Bonjour");

        System.out.println(hello1 == hello3); // false

        System.out.println(hello1.equals(hello3)); // true


        // Immutablity

        String hello4 = "Bonjour";
        hello4 += ", tout le monde" + " !";
        System.out.println(hello4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre prenom ? ");
        String userFirstName = scanner.nextLine();//.trim();
        System.out.println("Votre prenom est : " + userFirstName);

        System.out.println("Valeur rognee : " + userFirstName.trim());
        System.out.println("Valeur initiale : " + userFirstName); //trim() n'a pas modifie la valeur initiale

        String trimedValue = userFirstName.trim();
        System.out.println("Valeur rognee : " + trimedValue);


        // String Methods

        String javaCore = "JavaCore";

        System.out.println(javaCore.contains("Java")); // true

        System.out.println(javaCore.startsWith("java")); // false
        System.out.println(javaCore.endsWith("Core")); // true

        System.out.println(javaCore.toLowerCase()); // javacore
        System.out.println(javaCore.toUpperCase()); // JAVACORE

        System.out.println(javaCore.replaceAll("Java", "AWS")); // AWSCore








    }

}
