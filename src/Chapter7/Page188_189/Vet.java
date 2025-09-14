package Chap07.Page188_189;

// This class contains two methods: giveShot and feedAndExercise
public class Vet {
    public void giveShot(Animal a) {
        // Simulate giving a shot — animal reacts
        a.makeNoise(); // Only the reaction stays
        System.out.println(); // Adds a blank line
    }

    // New method where the animal eats and roams
    public void feedAndExercise(Animal b) {
        b.eat();        // Animal eats
        b.roam();       // Animal roams
        System.out.println(); // Adds a blank line
    }
}