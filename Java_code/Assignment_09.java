public class Assignment_09 {

    // Static function
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static function
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling the static function
        staticMethod();

        Assignment_09 obj = new Assignment_09();
        // Calling the non-static function using object
        obj.nonStaticMethod();
    }
}
