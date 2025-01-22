import java.util.*;

public class A1 {

     String str;


    public static boolean ispalindrome(String str)
    {

        
        int n = str.length();
        for(int i =0;i<n/2;i++)
        {
            if((str.charAt(i) )== str.charAt(n-i-1))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        // String str = "madam1";

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String:");
        String str = sc.nextLine();

     
        System.out.println(  ispalindrome(str));


        
    }
    
}
