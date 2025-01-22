 class p
{
    public static void m1()
    {
        System.out.println("parent");
    }
    
}
 class c extends p
{
    public static void m1()
    {
        System.out.println("child");
    }
    
}

class main
{    public static void main(String[] args) {
        // p p1 = new p();
        // p1.m1();

        // c c1 = new c();
        // c.m1();

        // p.m1();
        // c.m1();

        p y = new c();
        y.m1();

        // c y1 = new p();
        // y1.m1();



        

        
        
    }

   


    
    

}


