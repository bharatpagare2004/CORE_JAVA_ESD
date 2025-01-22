class Test{

    int a;
    double b;
    String s;

    Test()
    {
        int a =100;
        double b = 23.55;
        String s = "Pratap";

    }
    Test(int a,double b)
    {
        int  a1 = a;
         double b1 = b;
    }
    Test(String s)
    {
        String s1 = s;
    }

    public static void main(String args[])
    {

        Test a = new Test();
        
   

    }


}