public class String_sol {

    public static void main(String[] args) {

        // String s = new String("pratap");
        // System.out.println(s);
        // s.concat("software");
        // s = s.concat("solutions"); 
        // System.out.println(s);  
        
        System.out.println("-------");
         
        String s1 = "bharat";
        System.out.println(s1.charAt(3)); // we passing index of character
        System.out.println(s1.charAt(1));
        String s2 = "pagare";
        System.out.println(s2.concat(s1));// we pass the other string...

        System.out.println(s1.equals("bharat1"));
        System.out.println(s1.equalsIgnoreCase("BHARAT"));

        String s22 = "";
        String s12 ="met";

        System.out.println(s22.isEmpty());
        System.out.println(s12.isEmpty());

        System.out.println("the length of given string is:"+s12.length());
        // method always come with paranthesis


        // replace method of string 

        String str = "bharat";
        System.out.println(str.replace('a','y'));

        // a replace with y character...

        // substring 

        String s56 = "bharat";
        System.out.println(s56.substring(0,2)); // exclude
        System.out.println(s56.substring(2));

        String string = "  bha rat  ";
        System.out.println(string.indexOf('v'));
        // if character not present in the string it gives -1;
        System.out.println(string.indexOf('b'));

        System.out.println(string.trim());
    }   
}
