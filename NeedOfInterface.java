/*
 * To create a basic design of software, we can use interfaces
 * To make the program loosely coupled, we use interfaces
 */

interface Computer1{
    public void code();
}

class Laptop1 implements Computer1 {
    public void code() {
        System.out.println("Coding....");
    }
}

class Desktop1 implements Computer1
{
    public void code() {
        System.out.println("Coding....Faster");
    }
}

class Developer {
    public void devApp(Computer1 com) {
        com.code();
    }
}


public class NeedOfInterface {

    public static void main(String[] args) {
        Computer1 lap = new Laptop1();
        Computer1 desk = new Desktop1();
        Developer kartik = new Developer();
        kartik.devApp(lap);
    }
}