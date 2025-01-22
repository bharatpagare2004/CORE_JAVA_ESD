public class A11 {

static A11 s; // class object 

public static void main(String[] args) throws InterruptedException
 {
    A11 a = new A11();

    System.out.println(a.hashCode());
    a = null;
    System.gc();
    Thread.sleep(5000);

    System.out.println(s.hashCode());
    s = null;
    System.gc(); // garbage collector
    Thread.sleep(10000);

    System.out.println("main thread");    
 }

public void finalize()
{
    System.out.println("i am in finalize ");
    s = this;
} // only one we use finalize block for single object
    
}
