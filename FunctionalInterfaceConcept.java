/*
 * Functional Interface have only one abstract method
 * Lambda expression only works with functional interface
 */
@FunctionalInterface
interface FuncInterface {
    void show(int i);
}


public class FunctionalInterfaceConcept {
    public static void main(String[] args) {
        FuncInterface ob = new FuncInterface() {
            public void show(int i) {
                System.out.println("In show Method" + i);
            }
        };

        // Lambda Expression
        FuncInterface ob1 = (i) -> {
            System.out.println("In show Method" + i);
        };

        FuncInterface ob2 = i -> System.out.println("In show Method" + i);

        // FuncInterface ob3 = (i,j)-> i+j;
        // System.out.println(ob3.add(5,4));

        ob2.show(10);
    }
}
