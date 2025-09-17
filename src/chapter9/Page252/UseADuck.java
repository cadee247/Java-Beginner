class Duck {
    int size;
    boolean canFly;

    public Duck() {
        this.size = 5;
        this.canFly = true;
        System.out.println("🦆 Default Duck created.");
    }

    public Duck(int size) {
        this.size = size;
        this.canFly = true;
        System.out.println("🦆 Duck created with size: " + size);
    }

    public Duck(int size, boolean canFly) {
        this.size = size;
        this.canFly = canFly;
        System.out.println("🦆 Duck created with size: " + size + " and canFly: " + canFly);
    }

    public void quack() {
        System.out.println("Quack! I'm a duck of size " + size + " and I " + (canFly ? "can fly!" : "can't fly 😢"));
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        Duck d2 = new Duck(10);
        Duck d3 = new Duck(15, false);

        d1.quack();
        d2.quack();
        d3.quack();
    }
}