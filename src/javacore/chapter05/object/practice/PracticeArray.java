package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Valeur reference du tableau : " + integerArray);

        System.out.println("Taille du tableau : " + integerArray.length); // 5

        System.out.println("Premier element du tableau : " + integerArray[0]);
        System.out.println("Dernier element du tableau : " + integerArray[4]);

        integerArray[0] = 10;
        System.out.println("Premier element (edit) du tableau : " + integerArray[0]);


        for (int index = 0 ; index < integerArray.length; index++) {

            System.out.println(integerArray[index]);

        }

        for (int i : integerArray) {
            System.out.println(i);
        }


        int[] integerArray2 = new int[20];
        System.out.println("Premier element du tableau : " + integerArray2[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Combien de nombres souhaitez-vous additionner ? ");
        int wishedUserNumbers = scanner.nextInt();
        scanner.nextLine();

        int[] userArray = new int[wishedUserNumbers];

        for (int index : userArray) {
           userArray[index] = scanner.nextInt();
        }

        int sumResult = 0;

        for (int index : userArray) {
            sumResult += userArray[index];
        }
    }
}
