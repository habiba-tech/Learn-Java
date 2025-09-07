import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display result
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        sc.close();
    }
}
