package Chap08.Page209;

public class AnimalTestDrive {
    public static void main(String[] args) {
        // Create a new list that can hold Animal objects
        MyAnimalList list = new MyAnimalList();

        // Create a Dog and a Cat (both are subclasses of Animal)
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Add the Dog and Cat to the list
        list.add(dog); // Should print: "Animal added at 0"
        list.add(cat); // Should print: "Animal added at 1"
    }
}