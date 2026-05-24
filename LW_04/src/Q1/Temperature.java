package Q1;

import java.util.Scanner;

class Temperature {
    private double celsius;

    // No-Arg Constructor
    public Temperature() {
        celsius = 0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter method for Celsius
    public double toCelsius() {
        return celsius;
    }

    // Getter method for Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Setter method for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter method for Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

