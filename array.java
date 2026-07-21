import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read index
        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        // Check index validity
        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}