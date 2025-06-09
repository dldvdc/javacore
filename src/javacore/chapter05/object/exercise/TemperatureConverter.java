package javacore.chapter05.object.exercise;

public class TemperatureConverter {

    // 4
    public static final String CELSIUS_UNIT = "°C";
    // 5
    public static final String  FAHRENHEIT_UNIT = "°F";
    // 7
    public static final String  KELVIN_UNIT = "K";
    public static final double ZERO_CELSIUS_IN_KELVIN = 273.15;


    public static void main(String[] args) {

        // 3 - 7
        double celsius = 27.5;
        double fahrenheit = 81.5;
        double kelvin = 300.65;

        System.out.println(celsius + CELSIUS_UNIT + " en Fahrenheit = "
                + celsiusToFahrenheit(celsius) + FAHRENHEIT_UNIT);

        System.out.println(fahrenheit + FAHRENHEIT_UNIT + " en Celsius = "
                + fahrenheitToCelsius(fahrenheit) + CELSIUS_UNIT);

        System.out.println(celsius + CELSIUS_UNIT + " en Kelvin = "
                + celsiusToKelvin(celsius) + KELVIN_UNIT);

        System.out.println(fahrenheit + FAHRENHEIT_UNIT + " en Kelvin = "
                + fahrenheitToKelvin(fahrenheit) + KELVIN_UNIT);

        System.out.println(kelvin + KELVIN_UNIT + " en Celsius = "
                + kelvinToCelsius(kelvin) + CELSIUS_UNIT);

        System.out.println(kelvin + KELVIN_UNIT + " en Fahrenheit = "
                + kelvinToFahrenheit(kelvin) + FAHRENHEIT_UNIT);

    }

    // 1
    public static double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }

    // 2
    public static double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9 ;
    }

    // 7
    public static double celsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + ZERO_CELSIUS_IN_KELVIN;
    }

    public static double fahrenheitToKelvin(double fahrenheitTemperature) {
        return fahrenheitToCelsius(fahrenheitTemperature) + ZERO_CELSIUS_IN_KELVIN;
    }

    public static double kelvinToCelsius(double kelvinTemperature) {
        return kelvinTemperature - ZERO_CELSIUS_IN_KELVIN;
    }

    public static double kelvinToFahrenheit(double kelvinTemperature) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvinTemperature));
    }

}
