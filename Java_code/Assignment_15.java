class Base{
    int a,b;
    Base(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Base class constructor called");
    }
    void add(){
        System.out.println("Addition of Base class members : "+(a+b));
    }
}
class Derived extends Base{
    int c,d;
    Derived(int a,int b,int c,int d){
        super(a, b);
        this.c=c;
        this.d=d;
        System.out.println("Derived class constructor called");
    }
    void multiply(){
        System.out.println("Mutiplication of all members : "+(a*b*c*d));
    }
}
public class Assignment_15 {

    public static void main(String[] args) {
        Derived obj = new Derived(5, 10, 15, 20);
        obj.add();
        obj.multiply();
    }
}