// Every constructor has a method call: super()
class A extends Object {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }

    public B(int n) {
        this();  //Executing the same class constructor
        System.out.println("In B int");
    }
}

public class SuperConcept {
    public static void main(String[] args) {
        B obj = new B(5);
        System.out.println(obj);
    }
}
