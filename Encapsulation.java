
class Human {
    private int age;
    private String name;

    public Human() {

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
        ob.setAge(23);
        // ob.setAge(34, ob);
        ob.setName("Kartik Jaiswal");
        System.out.println(ob.getAge());
        System.out.println(ob.getName());
    }
}
