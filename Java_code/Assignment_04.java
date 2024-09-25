import java.util.Scanner;

public class Assignment_04 {

    static void binary_search(int[] arr, int s, int l, int val) {
        if (s < l) {
            int mid = s + (l - s) / 2;
            
            if (arr[mid] == val) {
                System.out.println(val + " found in array");
            } else if (arr[mid] < val) {
                binary_search(arr, mid + 1, l, val);
            } else if (arr[mid] > val) {
                binary_search(arr, s, mid, val);
            }
        } else {
            System.out.println(val + " not found in array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Our Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nEnter element you want to search in the array: ");
        int val = sc.nextInt();
        binary_search(a, 0, n, val);
        sc.close();
    }
}
