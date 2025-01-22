class a{

    public void m1()
    {
      System.out.println("m1");
    }
}
class b extends a
{
    public void m2()
    {
        System.out.println("m2");

    }
}


public class c {

    public static void main(String[] args) {
        
        a C1 = new a();
        C1.m1();

        b c1 = new b();
        c1.m2();
        c1.m1();


        

    }
    
}
