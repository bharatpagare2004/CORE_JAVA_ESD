interface Interface {


    public static void xyz()
    {
        System.out.println("the");
    }

    public default void abc()
    {
        System.out.println("a");
    }
    
}

class xyz implements Interface
{
    public static void main(String[] args) {

        Interface.xyz(); // with help of Interface name static method in interface
        // Interface.abc();
        xyz a = new xyz();
        a.abc(); //default method with help of child class obj;
    }
}
