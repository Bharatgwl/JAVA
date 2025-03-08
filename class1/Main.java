
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    void print() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class LinkList {

    LinkedList l;
    Scanner sc;

    LinkList() {
        l = new LinkedList();
        sc = new Scanner(System.in);
    }

    void takeInput(int size) {
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            l.insert(sc.nextInt());
        }
    }

    void printList() {
        l.print();
    }

    void closeScanner() {
        sc.close();
    }
}

public class Main {

    public static void main(String[] args) {
        // LinkList list = new LinkList();
        // list.takeInput(5);
        // list.printList();
        // list.closeScanner();
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.print();
    }
}
