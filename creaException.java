public class creaException {

    public static void main(String[] args) {
        // hand over created exception object to the jvm manually
        throw new ArithmeticException("/by zero its our message");
        // System.out.println("bharat"); it is not possible after the thow keyword
        // we got unreachable statement
    }
  
    
}
