
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

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Assignment_10 {
    public static void main(String[] args) {
        Person defaultPerson = new Person();
        defaultPerson.displayInfo();

        // Using the parameterised constructor to create an object
        Person parameterizedPerson = new Person("Alice", 30);
        parameterizedPerson.displayInfo();
    }
}
