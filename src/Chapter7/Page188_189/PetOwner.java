package Chap07.Page188_189;

// This class contains the start() method that creates instances of Vet and various Animals,
// then calls vet.giveShot() to simulate giving a shot.
public class PetOwner {
    public void start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        Lion lion = new Lion();
        Cat cat = new Cat();

        // Each animal reacts to the shot
        vet.giveShot(dog);   // Dog's makeNoise() runs
        vet.giveShot(hippo); // Hippo's makeNoise() runs
        vet.giveShot(cat);   // Cat's makeNoise() runs
        vet.giveShot(lion);  // Lion's makeNoise() runs

        // Optional: feed and exercise the animals
        vet.feedAndExercise(dog);
        vet.feedAndExercise(hippo);
        vet.feedAndExercise(cat);
        vet.feedAndExercise(lion);
    }

    public static void main(String[] args) {
        PetOwner owner = new PetOwner();
        owner.start(); // Calls the instance method to run the program
    }
}