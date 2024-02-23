class OuterClass {
    int age = 19;

    public void showAge() {
        System.out.println("Age is:" + age);
    }

    class InnerClass {
        String address = "Kurawar";

        public void showAddress() {
            System.out.println("Address is:" + address);
        }
    }
}

abstract class AbstractAnonymous {
    public abstract void demoMethod();
}

// InnerClass can be static but OuterClass can't
// Anonymous Inner class doesn't have name and definition at the time of object
// creation
public class InnerClassConcept {
    public static void main(String[] args) {
        OuterClass ob = new OuterClass();
        ob.showAge();

        OuterClass.InnerClass ob1 = ob.new InnerClass();
        ob1.showAddress();

        OuterClass ob2 = new OuterClass() {
            public void showAge() {
                System.out.println("Age from Anonymous class is:" + age);
            }
        };
        ob2.showAge();


        AbstractAnonymous obj = new AbstractAnonymous() {
            public void demoMethod()
            {
                System.out.println("Speaking from Demo Method...");
            }
        };
    
        obj.demoMethod();
    }

    
}
