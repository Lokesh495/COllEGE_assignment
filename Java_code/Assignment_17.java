class Base {
    int a, b;
    Base(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Base class constructor called");
    }

    void add() {
        System.out.println("Addition in Base class: " + (a + b));
    }
}

// Derived1 class inherits from Base
class Derived1 extends Base {
    Derived1(int a, int b) {
        super(a, b);  // Call the constructor of Base class
        System.out.println("Derived1 class constructor called");
    }
    void multiply() {
        System.out.println("Multiplication in Derived1 class: " + (a * b));
    }
}

// Derived2 class also inherits from Base
class Derived2 extends Base{
    Derived2(int a, int b) {
        super(a, b);  // Call the constructor of Base class
        System.out.println("Derived2 class constructor called");
    }
    void subtract() {
        System.out.println("Subtraction in Derived2 class: " + (a - b));
    }
}

public class Assignment_17 {
    public static void main(String[] args) {
        Derived1 obj1 = new Derived1(4, 5);
        obj1.add();        
        obj1.multiply();    
        Derived2 obj2 = new Derived2(10, 3);
        obj2.add();       
        obj2.subtract();    
    }
}
