class Aa{
    public void show()
    {
        System.out.println("A ShowMethod");
    }
    public void config()
    {
        System.out.println("In config");
    }
}
class Bb extends Aa{
    public void show()  //Method Overriding
    {
        System.out.println("B ShowMethod");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bb ob = new Bb();
        ob.show();
        ob.config();    
    }
}
