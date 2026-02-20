import java.util.Scanner;

public class Exercise07 {

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        System.out.println("Exercise 07");
        System.out.println("[EX] String reversed");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseString(input);

        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
