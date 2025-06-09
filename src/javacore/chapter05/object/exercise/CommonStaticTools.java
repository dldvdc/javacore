package javacore.chapter05.object.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonStaticTools {

    // 2
    public static int[] bubbleSort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // 3
    public static void main(String[] args) {

        List<Double> gradesList = new ArrayList<>();
        gradesList.add(16.0);
        gradesList.add(12.5);
        // etc...

    }

    // 4
     public static double calculateSquareRoot(double a) {
         return Math.sqrt(a);
     }

     public static double calculatePow(double base, double exponent) {
         return Math.pow(base, exponent);
     }

}
