interface q 
{
    static void sayhello(){
        System.out.println("hello");
    }
}
public class lmn implements q {
    public static void main(String[] args) {

        // lmn l = new lmn();
        // l.sayhello(); // it is not valid

        // lmn.sayhello(); // it is not valid
        

        q.sayhello(); // it is valid way to call static method in interface
        
    }
    
}
