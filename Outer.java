public class Outer {


    static class inner{

        public void method()
        {
            System.out.println("inner method");
        }

    }

    public static void main(String[] args) {
        Outer.inner obj = new Outer.inner();
    obj.method();
        
    }

    
    
}
