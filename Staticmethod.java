 class Staticmethod1 {

    public void display()
    {
        System.out.println("it is non static method");
    }
    public static void display2()
    {
        System.out.println("it is static method");
    }
  
}
public class Staticmethod
{
     static public void main(String[] args) {
        Staticmethod1 st = new Staticmethod1();
        st.display();
        Staticmethod1.display2();
        // Staticmethod.display();        
    }  
}

// what is the reason our main method public
//jvm acts as interpreter
//any one can access

