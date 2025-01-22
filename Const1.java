
    public class Const1 {
        public Const1() {
        System.out.println("i am in constructor");
        }
        public Const1(int a) {
        System.out.println("1 argument int");
        }
        private void Const1(int i) {
        System.out.println(i);
        }
        public static void main(String[] args) {
        Const1 c = new Const1();
        Const1 c1 = new Const1(10);
        c.Const1(10);
        }
        }
    

