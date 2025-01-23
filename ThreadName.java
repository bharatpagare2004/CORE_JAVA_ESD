class t extends Thread
{

    @Override
    public void run() {
        String s = Thread.currentThread().getName();
        System.out.println(s);
    }

}


public class ThreadName {

    public static void main(String[] args) {

        t t1 = new t();
    t1.setName("thread 1");
    t t2 = new t();
    t2.setName("thread 2");
    t t3 = new t();
    t3.setName("thread 3");
    t t4 = new t();
    t4.setName("thread 4");

    t1.start();
    t2.start();
    t3.start();
    t4.start();
        
    }


  

    

    
}
