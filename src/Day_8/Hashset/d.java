package Day_8.Hashset;

// Hashset from another collection
import java.util.*;
class d{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Vijay");

        HashSet<String> set=new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}