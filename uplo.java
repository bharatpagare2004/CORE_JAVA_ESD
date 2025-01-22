public class uplo {
    public static void main(String args[])
    {
        String str = "PrataP";
        StringBuffer lowercaseletter = new StringBuffer();
        StringBuffer uppercaseletter = new StringBuffer();
 
        for(char ch :str.toCharArray())
        {
         if(Character.isLowerCase(ch))
         {
             lowercaseletter.append(ch);
         }
         else
         {
             uppercaseletter.append(ch);
         }
        }

        System.out.println("uppercase letter from the String:"+uppercaseletter);
        System.out.println("lowercase letter from the String:"+lowercaseletter);
 
        
    }
    
}
