class Parent{
    public void showParent()
    {
        System.out.println("Speaking from Parent");
    }
}

class Child extends Parent{
    public void showChild()
    {
        System.out.println("Speaking from Child");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        // Parent ob = (Parent) new Child(); // UpCasting(automatically happens)
        Parent ob = new Child();
        ob.showParent();

        Child ob1 = (Child) ob;    // DownCasting
        ob1.showChild();
    }
}
