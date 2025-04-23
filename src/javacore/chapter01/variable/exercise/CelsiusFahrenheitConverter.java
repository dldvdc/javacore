package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {

    public static void main(String[] args) {

        // Température à convertir
        float temperatureCelsius = 30;

        // Conversion
        float temperatureFahrenheit = (temperatureCelsius * 9 / 5) + 32;

        // Affichage
        System.out.println("Une température de " + temperatureCelsius + "°C équivaut à " + temperatureFahrenheit + "°F.");

    }

}
