import java.util.Scanner;
public class Assignment_07{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr1,arr2;
        System.out.print("Enter row1 :");
        int r1 = sc.nextInt();
        System.out.print("Enter column1 :");
        int c1 = sc.nextInt();
        System.out.print("Enter row2 :");
        int r2 = sc.nextInt();
        System.out.print("Enter column2 :");
        int c2 = sc.nextInt();
        arr1 = new int[r1][c1];
        arr2 = new int[r2][c2];
        // Initialize the First array at run-time
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < r1; i++) {
            for(int j=0;j<c1;j++){
            arr1[i][j] = sc.nextInt();
            }
        }// Initialize the Second array at run-time
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < r2; i++) {
            for(int j=0;j<c2;j++){
            arr2[i][j] = sc.nextInt();
            }
        }
        // Display first array
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < r1; i++) {
            for(int j=0;j<c1;j++){
            System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        // Display Second array 
        System.out.println("Enter values of elements: ");
        for (int i = 0; i < r2; i++) {
            for(int j=0;j<c2;j++){
            System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] multiply = new int[r1][c2];
         // Matrix multiplication logic
         for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    multiply[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}