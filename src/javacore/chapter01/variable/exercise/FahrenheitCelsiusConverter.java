package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {
    public static void main(String[] args) {

        float temperatureFahrenheit = 86;

        float temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9 ;

        System.out.println("Une température de " + temperatureFahrenheit + "°F équivaut à " + temperatureCelsius + "°C.");

    }
}
