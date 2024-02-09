
class Mobile {
    String brand;
    int price;
    static String name; // Making the class member

    static // Static block is called only once
    {
        name = "SmartPhone";
        System.out.println("In Static block");
    }

    Mobile() {
        brand = "";
        price = 500;
    }

    void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    // Can't use instance variable in static class without object
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

public class StaticKeywordConcept {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); // Loading the class

        Mobile ob1 = new Mobile();
        ob1.brand = "Apple";
        ob1.price = 1550;

        Mobile.name = "SmartPhone"; // Calling with class name

        Mobile ob2 = new Mobile();
        ob2.brand = "Samsung";
        ob2.price = 1750;

        ob1.show();
        Mobile.show1(ob2);  // Calling the static method using the class name
    }
}
