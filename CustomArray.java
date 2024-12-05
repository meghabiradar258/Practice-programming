package org.example;


public class CustomArray {
    int size = 6;
    int count = 0;

    Object[] customArray = new Object[size];

    void printArray() {
        if (count != 0) {
            System.out.println("current elements in the array");
            for (int i = 0; i < count; i++) {
                System.out.print(customArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("array is currently empty");
        }
    }

    void add(Object element) {
        if (count < customArray.length) {
            customArray[count] = element;
            System.out.println("added element: " + element);
            count++;
        } else {
            System.out.println("  array is full ");
        }
    }

    void remove(Object element) {
        if (count != 0) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (customArray[i].equals(element)) {
                    found = true;
                    System.out.println("removing element: " + element);
                    // Shift elements to the left
                    for (int j = i; j < count - 1; j++) {
                        customArray[j] = customArray[j + 1];
                    }
                    customArray[count - 1] = null; // Clear the last element
                    count--;
                    break;
                }
            }
            if (!found) {
                System.out.println("element not found in the array" + element);
            }
        } else {
            System.out.println("  array is already empty");
        }
    }

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        customArray.add(5);
        customArray.add(8);
        customArray.add("Megha");
        customArray.remove(5);
        customArray.printArray();
        customArray.add(25);
        customArray.add(15);
        customArray.printArray();
        customArray.remove(8);
        customArray.printArray();
        customArray.add(50);
        customArray.remove(33);
        customArray.printArray();
    }
}

