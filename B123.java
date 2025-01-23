class mythread implements Runnable
{

    public void run()
    {
        System.out.println("printing the name five time");
        for(int i =0;i<5;i++)
        {
            System.out.println("bharat");
        }
        int j = 10+4;
        System.out.println("the addition is "+j);
        int j1= 10*4;
        System.out.println("the multiplicatio is "+j1);
     
    }

}


public class B123 {

    public static void main(String[] args) {
        mythread m1 = new mythread();

        Thread t1 = new Thread(m1);
        t1.start();

        for(int i = 1;i<=10;i++)
        {
            System.out.println(7*i);
        }

        
    }
    
}
