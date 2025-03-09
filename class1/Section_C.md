# Section C Answers

## 1. Inheritance with Multi-Level Inheritance Example

Inheritance is a mechanism in object-oriented programming where one class derives properties and behaviors from another class. Multi-level inheritance is a type of inheritance where a class is derived from another derived class.

### Example:

```Java
class Grandparent {
    void grandparentMethod() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.grandparentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}

```

This example demonstrates multi-level inheritance where `Child` class inherits from `Parent`, which in turn inherits from `Grandparent`.

---

## 2. Operations, Precedence, and Associativity

Operators in programming have precedence and associativity rules that determine the order in which expressions are evaluated. Here is an example:

### Example:

```Java
public class Main {
    public static void main(String[] args) {
        int result = 5 + 3 * 2; // Multiplication has higher precedence than addition
        System.out.println("Result: " + result); // Output: 11
    }
}

```

Precedence and associativity help in evaluating expressions correctly. Multiplication (`*`) has higher precedence than addition (`+`), so `3 * 2` is computed first, then `5` is added to it.

---

## 3. I/O Stream Operations

In Java, input and output operations are handled using Scanner (for input) and System.out.println

### Example:

In Java, input and output operations are handled using Scanner (for input) and System.out.println

````Java

import java.util.Scanner; // Import Scanner class

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read integer input

        System.out.println("You entered: " + number);

        scanner.close(); // Close scanner to free resources
    }

}

---

Abstract Class vs. Static Class in Java
In Java, abstract classes and static classes serve different purposes but share some similarities.

Similarities:
Neither can be instantiated directly.
Both define behavior that is not meant to change across instances.
Dissimilarities:
1. Abstract Class:
Used as a blueprint for other classes.
Can contain both abstract (unimplemented) and concrete (implemented) methods.
Can be inherited by subclasses.
Example:

java
Copy
Edit
abstract class AbstractBase {
    abstract void show(); // Abstract method (no implementation)

    void display() {
        System.out.println("Concrete method in abstract class.");
    }
}

class Derived extends AbstractBase {
    @Override
    void show() {
        System.out.println("Implemented abstract method in Derived class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show();
        obj.display();
    }
}
2. Static Class Alternative (Utility Class):
Java does not support static classes directly, but we can achieve a similar effect using a final class with all static members.
Cannot be inherited.
Used for utility functions (e.g., Math, Collections).
Example:

java
Copy
Edit
final class StaticClass {
    private StaticClass() {} // Private constructor prevents instantiation

    static void display() {
        System.out.println("Static method called.");
    }
}

public class Main {
    public static void main(String[] args) {
        StaticClass.display(); // Call without creating an instance
    }
}
Advantages & Disadvantages:
Feature	Abstract Class	Static Class Alternative
Flexibility	High	Low
Inheritance	Supported	Not supported
Instantiation	Not allowed	Not allowed
Use case	Base class for derived classes	Utility functions

## 5. Super and Final Keyword

The **super** keyword is used to refer to the parent class methods and constructors, while the **final** keyword is used to prevent further inheritance or method overriding.

### Similarities:

1. Both are used in inheritance.
2. Both help in maintaining the integrity of class behaviors.

### Dissimilarities:

1. **Super Keyword:**

   - Calls parent class constructors or methods.
   - Example in Java:

   ```java
   class Parent {
       void display() {
           System.out.println("Parent class");
       }
   }
   class Child extends Parent {
       void display() {
           super.display(); // Calls Parent's display()
           System.out.println("Child class");
       }
   }
````

2. **Final Keyword:**
   - Prevents method overriding or class inheritance.
   - Example in Java:
   ```java
   final class FinalClass {
       void display() {
           System.out.println("This class cannot be inherited");
       }
   }
   ```

### Advantages & Disadvantages:

| Feature     | Super Keyword              | Final Keyword         |
| ----------- | -------------------------- | --------------------- |
| Usage       | Calls parent class members | Prevents modification |
| Flexibility | High                       | Low                   |
| Overriding  | Supported                  | Restricted            |

---

## 6. Multithreading and Exception Handling

### Multithreading:

Multithreading allows multiple threads to run concurrently, improving performance.

### Exception Handling:

Exception handling manages runtime errors to prevent program crashes.

### Similarities:

1. Both improve program reliability and efficiency.
2. Both involve handling multiple tasks in a structured way.

### Dissimilarities:

1. **Multithreading:**

   - Deals with concurrent execution.
   - Example in Java:

   ```java
   class MyThread extends Thread {
       public void run() {
           System.out.println("Thread is running");
       }
   }
   public class Main {
       public static void main(String[] args) {
           MyThread t = new MyThread();
           t.start();
       }
   }
   ```

2. **Exception Handling:**
   - Deals with runtime errors.
   - Example in Java:
   ```java
   public class Main {
       public static void main(String[] args) {
           try {
               int x = 10 / 0;
           } catch (ArithmeticException e) {
               System.out.println("Cannot divide by zero.");
           }
       }
   }
   ```

### Advantages & Disadvantages:

| Feature     | Multithreading      | Exception Handling |
| ----------- | ------------------- | ------------------ |
| Performance | High                | No impact          |
| Complexity  | High                | Moderate           |
| Use case    | Parallel processing | Error handling     |

---
