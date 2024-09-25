class Base{
    private int a;
    private Base(int a){
        this.a=a;
    }
    static Base Tocall_private(int a){
        Base obj = new Base(a);
        return obj;
    }
    void display(){
        System.out.println("value of a is "+a);
    }
}

public class Assignment_11 {
    public static void main(String[] args) {
        Base obj=Base.Tocall_private(5);
        obj.display();
        
    }
}
