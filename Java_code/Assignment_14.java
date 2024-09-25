class Base{
    int a,b;
    Base(int a,int b){
        //we use this operator to target current object members
        this.a= a;
        this.b=b;
    }
    void add(){
        System.out.println("Addition of object variables : "+(a+b));
    }
}
public class Assignment_14 {

    public static void main(String[] args) {
        Base obj = new Base(5,10);
        obj.add();
    }
}