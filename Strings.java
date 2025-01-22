public class Strings {
  
    public static void main(String[] args) {
        String s = "met";
        s.concat("knowledge");
        System.out.println(s);

        

        StringBuffer s1 = new StringBuffer("bharat");
        s1.append("pagare");
        System.out.println(s1);


        String sb1 = new String("pratap");

        String sb2 = new String("pratap");

        System.out.println(sb1==sb2);

        System.out.println(sb1.equals(sb2));

    }


    
}
