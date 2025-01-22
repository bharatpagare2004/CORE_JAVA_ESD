public class finalize1 {


    public void finalize()
    {
        System.out.println("i am in finalize method");
    }
    public static void main(String[] args) {
        finalize1 f  = new finalize1();
        f =null;
        System.gc();
        System.out.println("main method ends");
       
    }
  
}
