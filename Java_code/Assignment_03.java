import java.util.Scanner;
public class Assignment_03 {
    static void linear_search(int[] arr,int n,int val){
        for(int i=0;i<n;i++){
            if(val==arr[i]){
                System.out.println(val+" found in array");
                return;
            }
        }
        System.out.println(val+" not found in array");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter values of elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Our Array : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nEnter element do you want to search in array : ");
        int val = sc.nextInt();
        linear_search(a, n, val);
        sc.close();
    }
}
