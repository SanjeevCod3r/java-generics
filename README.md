
# Java Generics - Notes & Examples

## 📌 Introduction to Generics  
Generics in Java allow us to create **classes, interfaces, and methods** that operate on **parameterized types**, ensuring **type safety** and **code reusability**.  

### 🔹 Why Use Generics?  
✔ **Type Safety** – Avoid \`ClassCastException\` by checking types at compile-time.  
✔ **Code Reusability** – Write **generic classes and methods** that work with multiple data types.  
✔ **Eliminates Type Casting** – No need for explicit type conversion.  
✔ **Compile-Time Checking** – Reduces runtime errors.  

---

## 📌 1️⃣ Generic Classes  
A **Generic Class** is a class that can operate on different types while maintaining type safety.  

### Example: Generic Storage Class  
\`\`\`java
public class Storage<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setItem("Hello, Generics!");
        System.out.println(stringStorage.getItem());

        Storage<Integer> intStorage = new Storage<>();
        intStorage.setItem(100);
        System.out.println(intStorage.getItem());
    }
}
\`\`\`

---

## 📌 2️⃣ Generic Methods  
A **Generic Method** allows a method to be parameterized with a type.  

### Example: Generic Method to Print Any Type  
\`\`\`java
public class GenericMethodExample {
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }

    public static void main(String[] args) {
        printElement("Hello, World!");
        printElement(42);
        printElement(3.14);
    }
}
\`\`\`

---

## 📌 3️⃣ Bounded Type Parameters  
Using **bounded type parameters**, we can **restrict** the type to a specific superclass or interface.  

### Example: Generic Class with a Bounded Type  
\`\`\`java
public class NumericBox<T extends Number> {
    private T value;

    public NumericBox(T value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>(10);
        NumericBox<Double> doubleBox = new NumericBox<>(5.5);
    }
}
\`\`\`

---

## 📌 4️⃣ Wildcards (`?`) in Generics  
Wildcards (`?`) allow **flexibility** when working with **unknown types**.  

### Example: Using Wildcards  
\`\`\`java
import java.util.List;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        System.out.println("Sum: " + sum);
    }
}
\`\`\`

---

## 📌 5️⃣ Multiple Type Parameters in Generics  
A generic class can have **multiple type parameters**.  

### Example: Key-Value Pair Class  
\`\`\`java
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}
\`\`\`

Usage:
\`\`\`java
Pair<String, Integer> studentAge = new Pair<>("Alice", 20);
System.out.println(studentAge.getKey() + " is " + studentAge.getValue() + " years old.");
\`\`\`

---

## 📌 6️⃣ Generic Interfaces  
Interfaces can also use **Generics** to define **flexible types**.  

### Example: Generic Comparable Interface  
\`\`\`java
interface Container<T> {
    void add(T item);
    T retrieve();
}

class Box<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T retrieve() {
        return item;
    }
}
\`\`\`

---

## 📌 Summary Table  
| Feature | Example |  
|---------|---------|  
| **Generic Class** | `class Box<T> {}` |  
| **Generic Method** | `<T> void method(T t) {}` |  
| **Bounded Type Parameter** | `<T extends Number>` |  
| **Wildcards (`?`)** | `List<? extends Number>` |  
| **Multiple Type Parameters** | `class Pair<K, V> {}` |  
| **Generic Interface** | `interface Container<T> {}` |  

---

## 🚀 Conclusion  
Generics are **powerful** in Java and **essential for writing reusable, type-safe, and flexible code**. Mastering them helps you build **robust and efficient** applications. 💡  

📌 **Happy Coding! 🚀**  

