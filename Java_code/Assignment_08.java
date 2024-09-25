public class Assignment_08 {

    // function of two parameter
    static int add(int a, int b) {
        return a + b;
    }

    // function of three parameter
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // function of different datatype
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(10, 20));
        System.out.println("Sum of three integers: " + add(10, 20, 30));
        System.out.println("Sum of two doubles: " + add(10.5, 20.5));
    }
}
