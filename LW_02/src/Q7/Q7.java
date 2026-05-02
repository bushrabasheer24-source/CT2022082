package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double w = input.nextDouble();

        System.out.print("Enter height (cm): ");
        double h = input.nextDouble();

        double bmi = w / Math.pow(h / 100.0, 2);

        System.out.println("BMI: " + bmi);
    }
}
