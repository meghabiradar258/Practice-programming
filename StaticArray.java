package org.example;

public class StaticArray {
    private Integer[] data;       // Array to hold Integer elements
    private int size = 0;         // Current number of elements in the array
    private final int capacity;    // Capacity of the array

    // Default constructor with a fixed capacity of 10
    public StaticArray() {
        this.capacity = 10; // Set a default capacity
        this.data = new Integer[capacity];
    }

    // Constructor with custom fixed capacity
    public StaticArray(int fixedCapacity) {
        if (fixedCapacity <= 0) {
            throw new IllegalArgumentException("Capacity should be greater than 0");
        }
        this.capacity = fixedCapacity;
        this.data = new Integer[fixedCapacity];
    }

    // Add a new element to the array
    public void add(Integer element) {
        if (size >= capacity) {
            throw new IllegalStateException("Array is full. Cannot add more elements.");
        }
        data[size++] = element;
    }

    // Remove element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // Nullify the last element after shifting
    }

    // Print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Main method to demonstrate the usage of StaticArray
    public static void main(String[] args) {
        StaticArray arrayDefault = new StaticArray(); // Uses default capacity of 10
        arrayDefault.add(1);
        arrayDefault.add(2);
        arrayDefault.add(3);
        arrayDefault.print(); // Output: 1 2 3

        StaticArray arrayCustom = new StaticArray(3); // Custom fixed capacity of 3
        arrayCustom.add(10);
        arrayCustom.add(20);
        arrayCustom.add(30);
        arrayCustom.print(); // Output: 10 20 30

        arrayCustom.remove(1); // Remove element at index 1
        arrayCustom.print(); // Output: 10 30
    }
}
