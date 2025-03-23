# Data Structures in Java: Stacks, Queues, and HashMaps

## Overview
This document provides an overview of three fundamental data structures in Java: **Stacks**, **Queues**, and **HashMaps**. These structures are widely used in programming to store and manage data efficiently.

---
## 1. Stack
A **Stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle.

### **Characteristics:**
- Elements are added and removed from the **top** of the stack.
- Uses the following operations:
    - `push(element)`: Adds an element to the top.
    - `pop()`: Removes and returns the top element.
    - `peek()`: Returns the top element without removing it.
    - `isEmpty()`: Checks if the stack is empty.

### **Common Applications:**
- Expression evaluation (e.g., postfix, prefix)
- Undo/Redo functionality in applications
- Function call management (recursion stack)
- Backtracking algorithms (e.g., solving mazes, DFS traversal)

---
## 2. Queue
A **Queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle.

### **Characteristics:**
- Elements are added at the **rear** and removed from the **front**.
- Uses the following operations:
    - `enqueue(element)`: Adds an element to the rear.
    - `dequeue()`: Removes and returns the front element.
    - `peek()`: Returns the front element without removing it.
    - `isEmpty()`: Checks if the queue is empty.

### **Types of Queues:**
- **Simple Queue** (FIFO behavior)
- **Circular Queue** (wrap-around behavior for efficiency)
- **Priority Queue** (elements are dequeued based on priority, not order)
- **Deque (Double-ended Queue)** (allows insertion/removal from both ends)

### **Common Applications:**
- Task scheduling (CPU scheduling, printer queue)
- BFS (Breadth-First Search) in graphs
- Real-world lines (ticket counters, call centers)
- Data streaming (handling requests in order)

---
## 3. HashMap
A **HashMap** is a key-value data structure that allows efficient storage and retrieval of elements using a **hash function**.

### **Characteristics:**
- Uses **hashing** to store and access elements.
- Keys are **unique**, but values can be duplicated.
- Offers **constant time (O(1))** average complexity for insert, delete, and lookup.
- Supports operations such as:
    - `put(key, value)`: Inserts a key-value pair.
    - `get(key)`: Retrieves the value associated with the key.
    - `remove(key)`: Removes the key-value pair.
    - `containsKey(key)`: Checks if the key exists.
    - `size()`: Returns the number of key-value pairs.

### **Common Applications:**
- Database indexing
- Caching mechanisms (e.g., LRU Cache)
- Counting frequency of elements
- Graph adjacency lists
- Fast lookups in large datasets

---
## Conclusion
**Stacks, Queues, and HashMaps** are essential data structures used in various real-world applications. Understanding their properties, use cases, and efficiency helps in writing optimized code and solving algorithmic problems effectively.

For more detailed implementations, refer to Java’s built-in classes:
- `Stack<E>` (from `java.util` package)
- `Queue<E>` and `Deque<E>` (from `java.util` package)
- `HashMap<K, V>` (from `java.util` package)

Happy Coding! 🚀