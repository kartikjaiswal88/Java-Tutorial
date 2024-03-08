class KartikException extends Exception{
    KartikException(String str)
    {
        super(str);
    }
}

public class ExceptionWithThrow {
    public static void main(String[] args) {
        



        int i = 18;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("I don't want to print Zero"); // Now We are handling the Exception
            else if(j==1)
                throw new KartikException("This is Kartik Exception");
        }
        catch(KartikException e)
        {
            j = 200;
            System.out.println("Speaking from KartikException catch Block: " + e);
        } 
        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("This is the Default Output " + e);
        } catch (Exception e) {
            System.out.println("Something Went Wrong!" + e);
        }

        System.out.println("After the Execution of Try Block");
        System.out.println("The value of j is:" + j);
    }
}
