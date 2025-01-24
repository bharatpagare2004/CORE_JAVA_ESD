
import java.util.*; // for checking string is null or not
public class MyOptional {
    public static Optional<String>getName()
    {
           String str = " I am in londan";
           return Optional.ofNullable(str);
    }
    public static void main(String[] args) {       
        // String s = "bharat"    
        // if(s==null)
        // {
        //     System.out.println("null");
        // }
        // else{
        //     System.out.println("not null");
        // }
        // Optional<String> opt = Optional.ofNullable(s);
        // System.out.println(opt.isPresent());
        // System.out.println(opt.isEmpty());
        // System.out.println(opt.orElse("null value"));
        // Optional is container object which may or may
        // may not contain a non-null value      
        Optional<String> n =  getName();
        System.out.println(n.isEmpty());
        System.out.println(n.isPresent());
        System.out.println(n.orElse("null value"));
    }
}
 
    

