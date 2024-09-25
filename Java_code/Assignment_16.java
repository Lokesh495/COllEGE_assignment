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

// Derived class inherits from Base
class Derived extends Base {
    int c;

    Derived(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Derived class constructor called");
    }

    void multiply() {
        System.out.println("Multiplication in Derived class: " + (a * b * c));
    }
}

// Derived2 class inherits from Derived
class Derived2 extends Derived {
    int d;

    Derived2(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
        System.out.println("Derived2 class constructor called");
    }

    void divide() {
        System.out.println("Division in FurtherDerived class: " + (a * b * c / d));
    }
}

public class Assignment_16 {
    public static void main(String[] args) {
        Derived2 obj = new Derived2(2, 3, 4, 6);
        obj.add();         
        obj.multiply();    
        obj.divide();    
    }
}
