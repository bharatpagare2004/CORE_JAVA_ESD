public class Employee1 {


    int id ; // non static 
    String name; // non static
    static String company_name = "met"; // for common purpose;
     Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display()
    {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("company_name: "+company_name);
    }

    public static void main(String[] args) {

        Employee1 e = new Employee1(12,"bharat");
        e.display();
        
    }
   
}
