package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.nextLine();

        System.out.print("Enter middle name: ");
        String middle = input.nextLine();

        System.out.print("Enter last name: ");
        String last = input.nextLine();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }
}
