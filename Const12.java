public class Const12 {
    public Const12() {
    this(10);
    System.out.println("i am in constructor only");
    }
    public Const12(int a){
    System.out.println("1 argument int");
    }
    public static void main(String[] args) {
    Const1 c=new Const1();
    }
    }