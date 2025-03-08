
import java.util.*;
class node {

    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlist {

    node head;
    node tail;

    linkedlist() {
        this.head = null;
        this.tail = null;

    }

    void insert(int data) {
        node newNode = new node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    void print() {
        node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class LinkList {
    public static void main(String[] args) {

        linkedlist l = new linkedlist();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.print();
    }
}
