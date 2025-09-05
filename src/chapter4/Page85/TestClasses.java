package chapter4.Page85;

class Horse {
    private double height = 15.2;
    private String breed;
    // more code...
}

class AddThing {
    int a;
    int b = 12;

    public int add() {
        int total = a + b;
        return total;
    }
}

class Foo {
    public int go() {
        int x = 5;
        int z = x + 3;  // This will cause a compile-time error if run
        return z;
    }
}

public class TestClasses {
    public static void main(String[] args) {
        AddThing at = new AddThing();
        at.a = 5;
        System.out.println("Sum is: " + at.add());

        Foo myfoo = new Foo();
        System.out.println("Sum is: " + myfoo.go());

    }
}

