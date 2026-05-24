package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea =
                outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area: " + shadedArea);

        System.out.println("Outer Circumference: "
                + outer.computeCircumference());

        System.out.println("Inner Circumference: "
                + inner.computeCircumference());
    }
}
