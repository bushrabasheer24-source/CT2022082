package Q3;

import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Compute Area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Compute Circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
