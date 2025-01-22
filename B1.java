public class B1 {

static int uppercase = 0;
static int lowercase = 0;


public static void count(String str)
{

    for(int i =0;i<= str.length();i++)
    {
             char ch = str.charAt(i);
            if(ch>=65&&ch<=95)
             {
                 uppercase++;
             }
            else
            {
                lowercase++;
            }
    }
        System.out.println("the count of lower case letter is :"+lowercase);

        System.out.println("the count of upper case letter is :"+uppercase);
}


public static void main(String[] args) {

    
    String str = "Bharat";
    count(str);
    
}
    
}
