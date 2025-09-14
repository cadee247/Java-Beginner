package Chap08.Page208;

// Class to hold a list of Dog objects
public class MyDogList {
    private Dog[] dogs = new Dog[5];   // Array to store up to 5 Dog objects
    private int nextIndex = 0;         // Tracks the next empty spot in the array

    // Adds a Dog to the list if there's space
    public void add(Dog d) {
        if (nextIndex < dogs.length) {           // Check if there's room left
            dogs[nextIndex] = d;                 // Add the Dog at the current index
            System.out.println("Dog added at " + nextIndex); // Confirm the addition
            nextIndex++;                         // Move to the next available spot
        }
        // If the list is full, do nothing
    }
}