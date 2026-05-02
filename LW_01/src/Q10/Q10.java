package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = input.nextLine();

        int middle = word.length() / 2;

        System.out.println(word.charAt(middle));
    }
}
