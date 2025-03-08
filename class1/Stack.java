
import java.util.Scanner;


class stackByarray {

    int top;
    int size;
    int arr[];

    public stackByarray(int size) {
        this.size = size;
        arr = new int[this.size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    void pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return;
        }
        top--;
    }

    void peek() {
        if (top == -1) {
            System.out.println("stack underflow");
            return;
        }
        System.out.println(arr[top]);
    }
}

public class Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        stackByarray s = new stackByarray(size);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.peek();
        s.pop();
        s.peek();
    }
}
