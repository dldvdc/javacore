package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args) {

        // Température à convertir
        float temperatureFahrenheit = 86;

        // Conversion
        float temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9 ;

        // Affichage
        System.out.println("Une température de " + temperatureFahrenheit + "°F équivaut à " + temperatureCelsius + "°C.");

    }

}
