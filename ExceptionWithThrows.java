class ExceptionWithThrowsDemo {

    public void show() throws ClassNotFoundException {

        Class.forName("Demo"); // Load the DemoThrows class

    }
}

public class ExceptionWithThrows {
    public static void main(String[] args) {
        ExceptionWithThrowsDemo ob = new ExceptionWithThrowsDemo();
        try {
            ob.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Hierarchi of Methods which is being called while throwing the exception
        }
    }
}
