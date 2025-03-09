# Section C Answers

## 1. Inheritance with Multi-Level Inheritance Example

Inheritance is a mechanism in object-oriented programming where one class derives properties and behaviors from another class. Multi-level inheritance is a type of inheritance where a class is derived from another derived class.

### Example:
```cpp
#include <iostream>
using namespace std;

class Grandparent {
public:
    void grandparentMethod() {
        cout << "This is the grandparent class." << endl;
    }
};

class Parent : public Grandparent {
public:
    void parentMethod() {
        cout << "This is the parent class." << endl;
    }
};

class Child : public Parent {
public:
    void childMethod() {
        cout << "This is the child class." << endl;
    }
};

int main() {
    Child obj;
    obj.grandparentMethod();
    obj.parentMethod();
    obj.childMethod();
    return 0;
}
```
This example demonstrates multi-level inheritance where `Child` class inherits from `Parent`, which in turn inherits from `Grandparent`.

---

## 2. Operations, Precedence, and Associativity

Operators in programming have precedence and associativity rules that determine the order in which expressions are evaluated. Here is an example:

### Example:
```cpp
#include <iostream>
using namespace std;

int main() {
    int result = 5 + 3 * 2; // Multiplication has higher precedence than addition
    cout << "Result: " << result << endl; // Output: 11
    return 0;
}
```

Precedence and associativity help in evaluating expressions correctly. Multiplication (`*`) has higher precedence than addition (`+`), so `3 * 2` is computed first, then `5` is added to it.

---

## 3. I/O Stream Operations

Input and output operations are handled using `cin` and `cout` in C++.

### Example:
```cpp
#include <iostream>
using namespace std;

int main() {
    string name;
    cout << "Enter your name: ";
    cin >> name;
    cout << "Hello, " << name << "!" << endl;
    return 0;
}
```

---

## 4. Abstract Class vs. Static Class

An **abstract class** is a class that cannot be instantiated and typically contains at least one pure virtual function. A **static class** is a class that cannot be instantiated, and all its members are static.

### Similarities:
1. Both cannot be instantiated directly.
2. Both are used to define behavior that should not change across instances.

### Dissimilarities:
1. **Abstract Class:**
   - Used to provide a blueprint for derived classes.
   - Can have both abstract (pure virtual) and concrete methods.
   - Example:
   ```cpp
   class AbstractBase {
   public:
       virtual void show() = 0; // Pure virtual function
   };
   ```

2. **Static Class:**
   - Used to hold utility functions that do not require an instance.
   - Cannot be inherited.
   - Example:
   ```cpp
   class StaticClass {
   public:
       static void display() {
           cout << "Static method called." << endl;
       }
   };
   ```

### Advantages & Disadvantages:
| Feature          | Abstract Class | Static Class |
|----------------|--------------|--------------|
| Flexibility   | High         | Low          |
| Inheritance   | Supported    | Not supported |
| Instantiation | Not allowed  | Not allowed  |
| Use case      | Base class for derived classes | Utility functions |

---

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
   ```

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
| Feature          | Super Keyword | Final Keyword |
|----------------|--------------|--------------|
| Usage         | Calls parent class members | Prevents modification |
| Flexibility   | High         | Low          |
| Overriding   | Supported    | Restricted   |

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
| Feature          | Multithreading | Exception Handling |
|----------------|--------------|--------------|
| Performance   | High         | No impact    |
| Complexity   | High         | Moderate     |
| Use case    | Parallel processing | Error handling |

---
