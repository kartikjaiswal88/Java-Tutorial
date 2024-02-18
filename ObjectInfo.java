class Example {
    Example() {
        System.out.println("Object is Created");
    }

    public void show() {
        System.out.println("In Show Method");
    }
}

public class ObjectInfo {
    public static void main(String[] args) {
        new Example().show(); // Anonymous Object

        Example obj; // Reference Variable
        obj = new Example(); // Object Creation
    }
}