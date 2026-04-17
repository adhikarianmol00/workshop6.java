package workshop6;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class qs4 {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();

        
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        
        System.out.println("--- Iterating through the list ---");
        for (String color : colors) {
            System.out.println(color);
        }

        
        System.out.println("\nChecking for 'Red'...");
        if (colors.contains("Red")) {
            System.out.println("Result: Red is in the list.");
        } else {
            System.out.println("Result: Red is not in the list.");
        }

       
        Collections.shuffle(colors);
        System.out.println("\nShuffled List: " + colors);

        
        Collections.sort(colors);
        System.out.println("Sorted List (Ascending): " + colors);
    }
}