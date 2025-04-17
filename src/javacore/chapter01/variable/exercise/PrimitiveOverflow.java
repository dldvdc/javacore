package javacore.chapter01.variable.exercise;

public class PrimitiveOverflow {
    public static void main(String[] args) {

        //1
        short hourSeconds = 3600;

        //2
        int  daySeconds = 24 * hourSeconds;

        //3
        int weekSeconds = 7 * daySeconds;

        //4
        int monthSeconds = 4 * weekSeconds;
        System.out.println(monthSeconds);

        monthSeconds = 30 * daySeconds;
        System.out.println(monthSeconds);
        // Plus proche de la moyenne enière réelle

        //5
        long yearSeconds = 12L * monthSeconds;
        System.out.println(yearSeconds);

        yearSeconds = 365L * daySeconds;
        System.out.println(yearSeconds);
        // Plus proche de la moyenne enière réelle
    }
}
