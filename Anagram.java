
import java.util.*;
class Result
{
    public static void Anagramornot(String str,String str1)
    {
        String s1 = str.toLowerCase();
        String s2 = str1.toLowerCase();
        if(s1.length() != s2.length())
        {
            System.out.println("not anagram");
        }
        else
        {
            char []s3= s1.toCharArray();
            char []s4 = s2.toCharArray();
            System.out.println(s3);
            for(int i = 0;i<s3.length ;i++)
            {
                System.out.print(" "+s3[i]+" ");

            }
            System.out.println();

            Arrays.sort(s3);
            Arrays.sort(s4);
            if(Arrays.equals(s3,s4))
            {
                System.out.println("the string is anagram------");
            }
            else{
                System.out.println("the string is not anagram");
            }

        }

    }
    
   

}
public class Anagram {
    public static void main(String[] args) {
        String str = "pratap";
        String str1 = "pparta";
        Result.Anagramornot(str,str1);
    }  
}
