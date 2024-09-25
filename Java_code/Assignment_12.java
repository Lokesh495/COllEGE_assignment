class Base{
    Base(){}
    static{
        // Static block
        System.out.println("hello this is a static block"+);
    }
    {
        // Inatance block
        System.out.println("hello this is a instance block");
    }
}
public class Assignment_12{
    public static void main(String[] args) {
        Base obj = new Base();
        Base obj1 = new Base();
        Base obj2 = new Base();
        
    }
}