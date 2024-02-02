public class TypeCasting {

    public static void main(String[] args) {
        byte a = 5;
        int b = 257;

        // a =(byte) b;
        b = a;
        System.out.println(a);
        System.out.println(b);

        // Type Promotion
        byte x = 10;
        byte y = 30;
        int result = x*y;
        System.out.println(result);
    }
}
