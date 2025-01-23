// //class Mythread extends Thread
class Mythread implements Runnable 
{
    public void run() // we override this method from the because runnable interface 
    {
        for(int i = 0;i<=5;i++)
        {
            System.out.println("bharat"); // thread 1
        }

        int c  = 10+5;
        System.out.println("addition is :"+c); // thread 2

        int c1 = 10-5;
        System.out.println("sub is :"+c1);

        int n =5;
        for(int i = 1;i<=10;i++)
        {
            System.out.println(n*i);
        }

    }    
}

public class B
{
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
//        m1.start();
    	 Thread t1 = new Thread(m1);
        //  t1.setName("the thread 1");
        //  System.out.println(t1);
    	 t1.start();
        
        
//        m1.run();// start method of thread class...
       

        for(int i =1;i<=5;i++)
        {
            System.out.println("main thread");
        }

        
    }

}
