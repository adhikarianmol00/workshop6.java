package workshop6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class qs13 {
    public static void main(String[] args) {
        
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
            "Red", "Blue", "Green", "Yellow", "Orange", "Purple"
        ));

        System.out.println("Original List: " + colors);

       
        Collections.sort(colors);
        System.out.println("Alphabetical Order: " + colors);

       
        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Reverse Alphabetical Order: " + colors);

       
        Collections.sort(colors, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-Insensitive Sort: " + colors);
    }
}
