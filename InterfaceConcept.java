/*
 * Basically used for Designing purpose
 * All methods in Interface are: public abstract as default
 * If we failed to implement the methods of interface then then class becomes abstract
 * All the variables in Interface are final and static by default
 * We can use the interface variables using interface name
 * Multiple Interitance can be done with the help of interface
 * Interface can extends the another interface using extends keyword
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
*/

interface InterfaceExample {
    int age = 22;
    String address = "Kurawar";

    void show();

    void config();
}

interface InterfaceExample2 {
    void run();
}

class ImplementsInterface implements InterfaceExample, InterfaceExample2 {
    public void show() {
        System.out.println("In Show Method");
    }

    public void config() {
        System.out.println("In Config Method");
    }

    public void run() {
        System.out.println("In Run Method");
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        InterfaceExample ob = new ImplementsInterface();
        ob.show();
        ob.config();

        System.out.println("Interface variable age:" + InterfaceExample.age);
        System.out.println("Interface variable address:" + InterfaceExample.address);
    }
}