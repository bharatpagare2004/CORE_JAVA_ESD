import java.util.*;
interface A {

    public abstract int sum(int a,int b);
    default void m1()
    {
        System.out.println("default method");
    }
    // Removed incorrect code from interface
   
    
}
class A123 
{
    public static void main(String args[])
    {
        A a1 = (a,b) ->a+b;
        System.out.println(a1.sum(23,33));



       
        
        Runnable r = ()->
        {
        int n = 5;
        for (int i = 0; i <= 10; i++) {
            System.out.println(n * i);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
               
            }
            
        }
    };

    Thread t = new Thread(r);
    t.start();
   
    }
}
