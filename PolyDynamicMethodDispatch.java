class Computer {
    public void show() {
        System.out.println("Speaking from Computer...");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("Speaking from Laptop...");
    }
}

class Tablet extends Computer {
    public void show() {
        System.out.println("Speaking from Tablet...");
    }
}

public class PolyDynamicMethodDispatch {
    public static void main(String[] args) {

        // RunTime Polymorphism: Dynamic Method Dispatch
        Computer ob = new Computer();
        ob.show();

        ob = new Laptop();
        ob.show();

        ob = new Tablet();
        ob.show();
    }
}
