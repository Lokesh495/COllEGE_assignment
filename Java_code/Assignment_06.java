import java.util.Scanner;

public class Assignment_06 {
    
    static class Stack {
        private int arr[];
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push operation function
        public void push(int element) {
            if (isFull()) {
                System.out.println("Stack Overflow!");
                return;
            }
            arr[++top] = element;
            System.out.println("Pushed " + element + " onto the stack.");
        }

        // Pop operation function
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            System.out.println("Popped " + arr[top] + " from the stack.");
            return arr[top--];
        }

        // Peek operation to view the top element of the stack
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                System.out.println("Stack is empty.");
                return -1;
            }
        }

        // Function to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Function to check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Display function for stack
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        // Create a stack object
        Stack stack = new Stack(size);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        if(stack.isFull()){
            System.out.println("Stack is Full");
        }
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        
    }
}
