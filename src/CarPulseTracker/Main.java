package CarPulseTracker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 🚗 Create real-world car objects with model, brand, horsepower, and pulse rating
        Car car1 = new Car("911 Carrera", "Porsche", 379, 8);
        Car car2 = new Car("Model S Plaid", "Tesla", 1020, 9);
        Car car3 = new Car("MP4-12C", "McLaren", 592, 10);
        Car car4 = new Car("Mustang GT", "Ford", 450, 9);

        // 🧰 Store all car objects in a list called 'garage'
        List<Car> garage = new ArrayList<>();
        garage.add(car1);
        garage.add(car2);
        garage.add(car3);
        garage.add(car4);

        // 🔢 Sort the cars by pulse rating in descending order
        garage.sort((a, b) -> b.getPulseRating() - a.getPulseRating());

        // 📊 Display all cars sorted by pulse rating
        System.out.println("🚘 Cars Sorted by Pulse:");
        for (Car c : garage) {
            System.out.println(c.describe()); // describe() returns a summary of the car
        }

        // ⚡ Filter and display only Tesla cars
        System.out.println("\n⚡ Tesla Cars:");
        for (Car c : garage) {
            if (c.getBrand().equalsIgnoreCase("Tesla")) {
                System.out.println(c.describe());
            }
        }

        // 🏁 Simulate a race between Tesla and Ford based on horsepower
        Car winner = car2.getHorsepower() > car4.getHorsepower() ? car2 : car4; // ← Set your breakpoint here
        System.out.println("\n🏁 Race between Tesla and Ford:");
        System.out.println("Winner: " + winner.describe());
    }
}