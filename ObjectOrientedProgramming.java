class Calculator {
    private int sum;

    public int add(int a, int b) {
        sum = a + b;
        return sum;
    }
}

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // Object: Properties and Behaviour

        // Creating the object
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 6 is:"+ calc.add(5, 6));
    }
}
