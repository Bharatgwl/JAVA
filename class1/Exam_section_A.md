# Java Concepts and Explanations

## 1. Examine the idea of using wrapper classes.

Wrapper classes in Java are used to convert primitive data types into objects. They provide utility methods for data manipulation and are essential when working with collections that store only objects.

Example:

```java
Integer obj = Integer.valueOf(10);
int num = obj.intValue();
```

## 2. Examine the idea of using exception handling classes.

Exception handling in Java ensures a smooth program flow by catching and handling runtime errors using `try`, `catch`, `finally`, and `throw`.

Example:

```java
try {
    int divide = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

## 3. Examine the idea of using threads.

Threads allow concurrent execution in Java, improving efficiency. Java provides `Thread` class and `Runnable` interface for creating threads.

Example:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
MyThread t = new MyThread();
t.start();
```

## 4. Examine the idea of using inheritance.

Inheritance allows one class to inherit properties and behavior from another, promoting code reusability.

Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

## 5. Express the reason for using garbage collection in Java.

Garbage collection automatically reclaims unused memory, preventing memory leaks and optimizing performance.

## 6. Express the reason for using control structures in Java.

Control structures like loops (`for`, `while`), decision-making (`if-else`, `switch`), and branching statements (`break`, `continue`) control the program flow.

## 7. Express the reason for using packages in Java.

Packages provide modularity, prevent name conflicts, and allow access control.

Example:

```java
package mypackage;
public class MyClass {
    public void display() {
        System.out.println("Hello");
    }
}
```

## 8. Express the reason for using abstract methods and classes in Java.

Abstract classes and methods enforce a structure in derived classes, ensuring implementation of critical functionalities.

Example:

```java
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
```

## 9. Write pros and cons of packages.

### Pros:

- Prevents name conflicts
- Improves modularity and reusability
- Access control

### Cons:

- Increases complexity
- Requires import statements

## 10. Write pros and cons of string buffers.

### Pros:

- Mutable and thread-safe
- More efficient for string modifications

### Cons:

- Slower than `StringBuilder`

## 11. Write pros and cons of static methods and classes.

### Pros:

- Memory efficient (no object needed)
- Useful for utility functions

### Cons:

- Limited flexibility
- Cannot access instance variables

## 12. Write pros and cons of I/O streams.

### Pros:

- Efficient data handling
- Supports different types of data

### Cons:

- Can be complex to manage
- Requires exception handling

## 13. State the result of Byte streams in Java.

Byte streams handle binary data, used for file handling.

Example:

```java
FileInputStream fin = new FileInputStream("data.txt");
int i = fin.read();
```

## 14. State the result of creating your own exception in Java.

Custom exceptions allow specific error handling.

Example:

```java
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
```

## 15. State the result of interface command in Java inheritance.

Interfaces support multiple inheritance by defining method signatures.

Example:

```java
interface Animal {
    void makeSound();
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

## 16. State the result of `this` keyword in Java.

`this` refers to the current class instance.

Example:

```java
class MyClass {
    int x;
    MyClass(int x) {
        this.x = x;
    }
}
```

## 17. Mention any two operations used in Method Overriding with examples.

1. Overriding a method:

```java
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
}
```

2. Calling overridden method using `super`:

```java
class Parent {
    void display() {
        System.out.println("Parent display");
    }
}
class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child display");
    }
}
```

## 18. Mention any two operations used in Multithreading with examples.

1. Creating a thread using `Thread` class:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```

2. Implementing `Runnable`:

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}
```

## 19. Mention any two operations used in Packages with examples.

1. Importing a package:

```java
import java.util.*;
```

2. Creating a package:

```java
package mypackage;
```

## 20. Mention any two operations used in Garbage collection with examples.

1. Explicit garbage collection:

```java
System.gc();
```

2. Nullifying references:

```java
MyClass obj = new MyClass();
obj = null;
```

---

