import java.util.*;

// import java.util.Comparator;
// import java.util.TreeSet;
// import java.util.TreeSet;

class mycomparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Integer obj1  = (Integer)o1;
        Integer obj2  = (Integer)o2;
        return obj2.compareTo(obj1);
    }


}
public class ArrayList1 {

    public static void main(String[] args) {
        // ArrayList<Object> a1 = new ArrayList<>();

        // a1.add(10);
        // a1.add("pratap");
        // a1.add(12.5);
        // a1.add('c');
        // a1.add(null);
        // a1.add("pratap");

        // System.out.println(" "+a1+" ");
        // ArrayList is the class of list interface
        // resizable
        // allow hetro and homo item
        // duplication allowed
        // insertion order preserved
        // null also allowed


        // LinkedList a1 = new LinkedList<>();
        // a1.add("bharat");
        // a1.add(90);
        // a1.add('c');
        // a1.add('c');
        // a1.add(null);
        // System.out.println(a1);

        // insertion deletion is imp

        // Vector v1 = new Vector();
        // v1.add("bharat");
        // v1.add("bharat");
        // v1.add(90);
        // v1.add('c');
        // v1.add('c');
        // v1.add(null);
        // System.out.println(v1);

        // in vector most method are synchronized
     // that's thread safety is 
     // performance low


     // set interface

    //  HashSet h1 = new HashSet();
    //  h1.add("bharat");
    //  h1.add("bharat");
    //  h1.add(12);
    //  h1.add(null);
    //  h1.add('c');
    //  h1.add(null);
    //  System.out.println(h1);

     // for searching
     // insertion order not maintain
     // duplication not possible

    //  LinkedHashSet h1 = new LinkedHashSet();
    //  h1.add("bharat");
    //  h1.add("bharat");
    //  h1.add(12);
    //  h1.add(null);
    //  h1.add('c');
    //  h1.add(null);
    //  System.out.println(h1);
     // insertion order maintain
     // duplication not possible
     // null allowed

     

//    SortedSet <Integer>s1 = new TreeSet(new mycomparator()) ;
//     s1.add(10);
//     s1.add(12);
//     s1.add(133);
//     s1.add(13);
//     System.out.println(s1);
        TreeSet t = new TreeSet<>();
        t.add(23);
        t.add(10);
        t.add(23);
        System.out.println(t);
 
    }
   
}
