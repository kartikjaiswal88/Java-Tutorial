abstract class Animal {
    public abstract void speak();
    public abstract void run();

    public void move() {
        System.out.println("Moving....");
    }
}

abstract class Dog extends Animal {
    public void speak() {
        System.out.println("Barking....");
    }
}

class GermanShephard extends Dog{  // Concrete Class

    
    public void run() {
        System.out.println("Running...");
    }
    
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // We can't create the object of abstract class but can create object reference
        // It is not compulsion that abstract class should have abstract method but
        // abstract method must be in abstract class
        // If we don't want to implement the abstract method of abstract class then make the abstract class 


        Animal am = new GermanShephard();
        am.speak();
        am.move();
    }
}
