import java.util.Scanner;

public class Assignment_05 {

    // Function to perform Bubble Sort on the array
    static void Bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare the array
        int[] a;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        a = new int[n];
        
        // Initialize the array at run-time
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Display the array before sorting
        System.out.print("Our Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        //fucntion call
        Bubble_sort(a, n);
        
        // Display the array after sorting
        System.out.print("Our Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}

