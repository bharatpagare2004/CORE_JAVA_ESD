import CalPack.*; // importing all the class inside the package means that folder....
import CalPack.newclass; // also same here
public class calling {
    public static void main(String args[])
    {
        calcy c = new calcy(); // creating object of that class which are defined in the Pack package....
        newclass nc = new newclass();

        int add =c.add(23,33);
        int sub =c.sub(33,44);
        int mul =nc.mul(23,33);

        System.out.println("addition:"+add);
        System.out.println("sub:"+sub);
        System.out.println("mul:"+mul);

    }
    
}
