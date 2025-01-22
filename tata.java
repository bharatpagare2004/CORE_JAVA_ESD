abstract class Car {

 abstract void fueltype();

    void colortype()
    {
        System.out.println("gray");
    }
    
}

class tata extends Car
{

    public void fueltype()
    {

        System.out.println("petrol");
        
    }

    public static void main(String[] args) {

        tata t = new tata();
        t.fueltype();
        t.colortype();  


    }
}

