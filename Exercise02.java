import java.util.Scanner;

public class Exercise02 {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min) min = arr[i];
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        System.out.println("Exercise 02");
        System.out.println("[PW] Greatest and smallest elements");

        // from command line
        if (args.length > 0) {
            int[] arr = new int[args.length];
            for (int i = 0; i < args.length; i++)
                arr[i] = Integer.parseInt(args[i]);

            System.out.println("\nFrom command line:");
            System.out.println("Min: " + findMin(arr));
            System.out.println("Max: " + findMax(arr));

            int[] both = findMinMax(arr);
            System.out.println("Both -> Min: " + both[0] + ", Max: " + both[1]);
        }

        // from scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of elements: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        System.out.println("\nFrom scanner:");
        System.out.println("Min: " + findMin(arr2));
        System.out.println("Max: " + findMax(arr2));

        int[] both2 = findMinMax(arr2);
        System.out.println("Both -> Min: " + both2[0] + ", Max: " + both2[1]);

        sc.close();
    }
}
