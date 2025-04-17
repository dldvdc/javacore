package javacore.chapter01.variable.exercise;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args) {

        float temperatureCelsius = 30;

        float temperatureFahrenheit = (temperatureCelsius * 9 / 5) + 32;

        System.out.println("Une température de " + temperatureCelsius + "°C équivaut à " + temperatureFahrenheit + "°F.");

    }
}
