interface A {


    // public abstract int length(String str);
    public abstract int reminder(int a , int b);
    
}

public class String_length_lambda
{

    public static void main(String arg[])
    {
        // String str = "name";
        // A a = (s) -> s.length();
        // System.out.println(a.length(str));

        A a1 = (int a ,int b) ->a%b;
        System.out.println(a1.reminder(5, 10));

       

       
  
    }
}
