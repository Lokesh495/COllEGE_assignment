import java.util.Scanner;
public class Assignment_01{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.print(a*i+" ");
    }
    sc.close();
    }
}