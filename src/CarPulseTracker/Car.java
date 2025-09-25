package CarPulseTracker;

// 🚗 Represents a car with key attributes and a custom "pulse rating" for thrill factor
public class Car {
    // 🔧 Car properties
    private String model;        // e.g. "911 Carrera"
    private String brand;        // e.g. "Porsche"
    private int horsepower;      // Engine power in HP
    private int pulseRating;     // Custom thrill factor from 1 to 10

    // 🏗️ Constructor to initialize a new Car object with all attributes
    public Car(String model, String brand, int horsepower, int pulseRating) {
        this.model = model;
        this.brand = brand;
        this.horsepower = horsepower;
        this.pulseRating = pulseRating;
    }

    // 📈 Returns the car's pulse rating (used for sorting or comparison)
    public int getPulseRating() {
        return pulseRating;
    }

    // 🏷️ Returns the brand name of the car
    public String getBrand() {
        return brand;
    }

    // 🏷️ Returns the model name of the car
    public String getModel() {
        return model;
    }

    // ⚙️ Returns the horsepower value
    public int getHorsepower() {
        return horsepower;
    }

    // 📝 Returns a formatted description of the car for display
    public String describe() {
        return brand + " " + model + " — " + horsepower + "HP — Pulse: " + pulseRating + "/10";
    }
}