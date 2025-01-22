public class UpperCaseLowerCase {

    static int lowercaseletter = 0;
    static int uppercaseletter = 0;

    public static void checkLowerUppercase(String str)
    {  
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch>=65&&ch<=95)
            {
                uppercaseletter++;
            }
            else{

                lowercaseletter++;

            }
        }
        System.out.println("the uppercase letter in the String:"+lowercaseletter);
        
        System.out.println("the uppercase letter in the String:"+uppercaseletter);
    }




    public static void main(String[] args) {

        String str = "bharaTII";
        checkLowerUppercase(str);
        
    }
    
}
