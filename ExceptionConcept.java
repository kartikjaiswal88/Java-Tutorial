/*
 * Runtime Error{Exceptions} stops the execution of Application 
 * To avoid the stopping the execution of application we handle the exception
 * Exception e : Can handle any type of Exception
 */
public class ExceptionConcept {
    public static void main(String[] args) {
        int i = 2;
        int j= 0;
        String str = null;

        int num[] = new int[5];

        try {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(num[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero!");
        }
        catch( ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit!");
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong!"+ e);
        }




        System.out.println("After the Execution of Try Block");
        System.out.println("The value of j is:"+j);
    }
}
