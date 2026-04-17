package workshop6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class qs3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int positions = 2;

        System.out.println("Original List: " + numbers);

      
        Collections.rotate(numbers, positions);

        System.out.println("Rotated List: " + numbers);
    }
}
