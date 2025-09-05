package chapter4.Page84;

// Define a simple class representing a dog with private attributes
class PoorDog {
    // Instance variables are private and not initialized
    private int size;       // Dog's size (default value: 0)
    private String name;    // Dog's name (default value: null)

    // Getter method for size
    public int getSize() {
        return size;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Test class to create and interact with a PoorDog object
public class PoorDogTestDrive {
    public static void main(String[] args) {
        // Create a PoorDog instance using the default constructor
        PoorDog one = new PoorDog();

        // Print the dog's size and name using getter methods
        // Since no values were set, outputs will be default: 0 and null
        System.out.println("Dog size is " + one.getSize());   // Output: 0
        System.out.println("Dog name is " + one.getName());   // Output: null
    }
}