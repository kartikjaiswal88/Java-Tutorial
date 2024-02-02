public class DataTypes {

    public static void main(String[] args) {
        // Integers
        int a = 5; // 4byte
        long b = 5l; // 8byte
        short c = 5; // 2 byte
        byte d = 5; // 1byte

        // Floating Value
        float e = 5.6f; // 4byte
        double f = 5.6; // 8byte more precision and default

        // Characters follows the UNICODE(all the characters in the world)
        char g = 'k'; // 2byte

        // Boolean: true or false(0 and 1: wrong)
        boolean h = true;

        System.out.println(a + b + c + d);
        System.out.println(e + f);
        System.out.println(g);
        System.out.println(h);

        // literals
        int num = 0b111; //Binary 
        int num1 = 0x11E; //HexaDecimal
        int num2 = 10_0_0; 
        double num3 = 12e10;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
