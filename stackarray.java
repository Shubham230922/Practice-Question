import java.util.Scanner;

class stackarray {
    int top;
    int size;
    int arr[];
    int temp;

    stackarray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        if (top == size - 1) {
            System.out.println("overflow");
            return;

        } else {
            arr[++top] = val;
            System.out.println(val + "push into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("underflow");
        } else {
            temp = arr[top];
            System.out.println(arr[top--] + "poped from stack");
        }

    }

    void peek() {
        if (top == -1) {
            System.out.println("stack is empty");5
            
        } else {
            System.out.println(arr[top] + "top element");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.err.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();
        stackarray stack = new stackarray(size);
        int choice, val;
        do {
            System.out.println("\n stack menu");
            System.out.println("\n 1 push ");
            System.out.println("\n 2. pop");
            System.out.println("\n 3 peek");
            System.out.println("\n 4 display all value present in stack");
            System.out.println("\n 5 exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter value");
                    val = sc.nextInt();
                    stack.push(val);

                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }
        } while (choice != 5);
        sc.close();

    }
}