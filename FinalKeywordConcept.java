//final: variable(making constant), method and class(stoping the Inheritance)

final class FinalClass {
    public void show() {
        System.out.println("In FinalClass show");
    }
}

class Vehicle {
    public final void moving() {
        System.out.println("Moving Forward...");
    }
}

class Car extends Vehicle {
    // public void moving()
    // {

    // }
}

public class FinalKeywordConcept {
    public static void main(String[] args) {
        final int num = 8;
        System.out.println(num);

        Vehicle ob = new Car();
        ob.moving();
    }
}
