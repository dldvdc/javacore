package javacore.chapter01.variable.exercise;

public class VariablesPermutation {
    public static void main(String[] args) {
        //1
        int a = 12;
        int b = 14;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2
        System.out.println("\nPermutation");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
