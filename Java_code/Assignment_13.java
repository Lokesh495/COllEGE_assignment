class Base{
    String name;
    int age;
    Base(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Assignment_13 {
    public static void main(String[] args) {
        // Creating two objects with the same values
        Base obj1 = new Base("Lokesh", 20);
        Base obj2 = new Base("Lokesh", 20);
        
        // hashCode() function:
        System.out.println("HashCode of obj1: " + obj1.hashCode());
        System.out.println("HashCode of obj2: " + obj2.hashCode());

        // equals() function: 
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2));

        // getClass() function:
        System.out.println("Class of obj1: " + obj1.getClass());
        System.out.println("Class of obj2: " + obj2.getClass());

        // toString() function:
        System.out.println("toString() of obj1: " + obj1.toString());
        System.out.println("toString() of obj2: " + obj2.toString());
    }
}
