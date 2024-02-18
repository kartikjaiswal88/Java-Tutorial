class Calci {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class AdvanceCalci extends Calci {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvanceCalci extends AdvanceCalci
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        AdvanceCalci ob = new AdvanceCalci();

        int a = ob.add(4, 6);
        int b = ob.sub(5, 3);
        int c = ob.multi(4, 6);
        int d = ob.div(12, 3);

        VeryAdvanceCalci obj = new VeryAdvanceCalci();
        double e = obj.power(2, 5);

        System.out.println("a:" + a + " b:" + b + " c:" + c + " d:" + d +" e:"+e);

    }
}
