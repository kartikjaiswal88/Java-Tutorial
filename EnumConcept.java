enum Status {
    Running, Pending, Failed, Success; // These are NamedConstant(objects)
}

public class EnumConcept {
    public static void main(String[] args) {

        Status s = Status.Pending; // Getting directly object
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] arr = Status.values(); // Getting the array of objects
        for (Status a : arr) {
            System.out.println(a + " : " + a.ordinal());
        }

        s = Status.Running;
        if (s == Status.Failed)
            System.out.println("Try Again!");
        else if (s == Status.Pending)
            System.out.println("Please Wait!");
        else if (s == Status.Running)
            System.out.println("All Good!");
        else
            System.out.println("Done!");

        switch (s) {
            case Running:
                System.out.println("All Good!");
                break;
            case Pending:
                System.out.println("Please Wait!");
                break;
            case Failed:
                System.out.println("Try Again!");
                break;
            default:
                System.out.println("Done!");
                break;
        }
    }
}
