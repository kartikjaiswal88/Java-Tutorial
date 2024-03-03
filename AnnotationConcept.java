/*
 * Annotations are generally used for getting compile time error
 */

class AnnotA{
    public void show()
    {
        System.out.println("Show of AnnotA");
    }
}


class AnnotB extends AnnotA {

    @Override
    public void show() {
        super.show();
    }
    
    
}

public class AnnotationConcept {
    public static void main(String[] args) {
        AnnotB ob = new AnnotB();
        ob.show();
    }
}
