package workshop6;

import java.util.HashMap;
import java.util.Map;

public class qs10 {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        
        contacts.put("Abhinash", "9800000000");
        contacts.put("Suresh", "9811111111");
        contacts.put("Anjali", "9822222222");
        contacts.put("Priya", "9833333333");

      
        String nameToSearch = "Abhinash";
        if (contacts.containsKey(nameToSearch)) {
            System.out.println(nameToSearch + "'s Phone Number: " + contacts.get(nameToSearch));
        }

       
        contacts.put("Abhinash", "9844444444");
        System.out.println("Updated number for Abhinash: " + contacts.get("Abhinash"));

       
        
        System.out.println("\n--- Full Contact List ---");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " | Phone: " + entry.getValue());
        }
    }
}