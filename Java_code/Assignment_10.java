
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;          
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;   
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Assignment_10 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.display();

        // Using the parameterised constructor to create an object
        Person obj2 = new Person("Lokesh",20);
        obj2.display();
    }
}
