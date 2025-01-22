 class Encapsulation
{
    private int id;
    private String name;
    private String collegename;


    // public Encapsulation(int id, String name, String collegename) {
    //     this.id = id;
    //     this.name = name;
    //     this.collegename = collegename;
    // }

    Encapsulation() // default constructor
    {

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCollegename() {
        return collegename;
    }


    public void setCollegename(String collegename) {
        this.collegename = collegename;
    } 
}

public class Encapsulation1{

    public static void main(String args[])
    {
        Encapsulation e = new Encapsulation();

                e.setId(101);
                System.out.println("Id of Student:"+e.getId());
                System.out.println();
                
                e.setName("bharat");
                System.out.println("Name of student:"+e.getName());
                System.out.println();
                
                e.setCollegename("Met");
                System.out.print("College Name of student:"+e.getCollegename());
                System.out.println();

    }

}

