// Define a simple Dog class with private fields and public getters
class PoorDog {
    private int size;       // Dog's size in arbitrary units
    private String name;    // Dog's name

    // Constructor to initialize the dog's attributes
    public PoorDog(int size, String name) {
        this.size = size;
        this.name = name;
    }

    // Getter method for size
    public int getSize() {
        return size;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Test class to create and display a PoorDog instance
class PoorDogTestDrive {
    public static void main(String[] args) {
        // Create a PoorDog object with specific size and name
        PoorDog one = new PoorDog(42, "Biscuit");

        // Print the dog's size and name using getter methods
        System.out.println("Dog size is " + one.getSize());   // Expected: 42
        System.out.println("Dog name is " + one.getName());   // Expected: Biscuit
    }
}