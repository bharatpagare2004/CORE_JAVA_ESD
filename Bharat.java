import java.util.*;
interface  client {

    void input();
    void output();
    
}

class Bharat1 implements client
{
    String name;
    String Password;

    public void input() // public is require here
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name:");
        System.out.println();
        name = sc.nextLine();
        System.out.print("enter the Password:");
        Password = sc.nextLine();
        System.out.println();
    }
    
    public void output()
    {
        System.out.println("The name of student:"+name);
        System.out.println();
        System.out.println("The Password of student:"+Password);
        System.out.println();
    }
}

public class Bharat{
    public static void main(String[] args) {

        Bharat1 b = new Bharat1();
        b.input();
        b.output();
            
        }
}