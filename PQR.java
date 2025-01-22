interface abc{
    default void m1()
    {
        System.out.println("I am in interface in abc");
    }
}
interface xyz{
    default void m1()
    {
        System.out.println("I am in interface in xyz");
    }
}
public class PQR implements abc,xyz 
{


    public void m1() {
        abc.super.m1();
        // xyz.super.m1();
    }
    public static void main(String[] args) {

        PQR p = new PQR();
        p.m1();
    }
}
