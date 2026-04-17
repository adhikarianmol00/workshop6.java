package workshop6;

import java.util.TreeSet;

public class qs8 {
    public static void main(String[] args) {
       
        TreeSet<String> names = new TreeSet<>();

        
        names.add("Suresh");
        names.add("Abhinash");
        names.add("Priya");
        names.add("Bibek");
        names.add("Anjali");
        
       
        names.add("Abhinash"); 

      
        System.out.println("Unique Names (Alphabetical Order): " + names);

       
        System.out.println("First Name: " + names.first());
        System.out.println("Last Name: " + names.last());
        
        
        if (names.contains("Priya")) {
            System.out.println("Priya is in the list.");
        }
    }
}