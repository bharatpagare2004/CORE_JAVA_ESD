import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class  arith{


    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;
        int c = 0;
        try{
            System.out.println(c =a/b);
        } 

        catch(ArithmeticException e)
        {
            System.out.println("arithmetic");

        }
        catch(Exception e)
        {
            System.out.println("exception");

        }
        finally{
            System.out.println("always executed");
        }

       
    }
    
}
