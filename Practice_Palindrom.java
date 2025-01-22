public class Practice_Palindrom {


   static String str = "mam00";
    static String str1 = "";


    public static void checkpalindrome(String str)
    {


    for(int i = str.length()-1;i>=0;i--)
    {
            str1 =str1+str.charAt(i);
    }
    if(str.equals(str1))
    {
        System.out.println("the string is Palindrome");
    }
    else
    {
        System.out.println("the string is not Palindrome");
    }
    }

    public static void main(String[] args) {

        checkpalindrome(str);
        
    }
    
}
