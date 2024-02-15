
class Human {
    private int age;
    private String name;

    public Human() { // Default Constructor
        age = 18;
        name = "Kartik";
    }

    public Human(int age, String name) { // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public void setAge(int age, Human ob) { // Alternative for "this" keyword
    // ob.age = age;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Human ob = new Human();
        Human ob1 = new Human(55, "Jaiswal");
        ob.setAge(23);
        // ob.setAge(34, ob);
        ob.setName("Kartik Jaiswal");
        System.out.println("Name:" + ob.getName() + " Age:" + ob.getAge());
        System.out.println("Name:" + ob1.getName() + " Age:" + ob1.getAge());
    }
}
