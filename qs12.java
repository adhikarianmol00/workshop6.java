package workshop6;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class qs12 {
    public static void main(String[] args) {
       
        int[] primitiveNumbers = {45, 12, 89, 7, 33};
        Arrays.sort(primitiveNumbers);
        System.out.println("Ascending (Primitive Array): " + Arrays.toString(primitiveNumbers));

        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(7);
        numbers.add(33);

        
        Collections.sort(numbers);
        System.out.println("Ascending (ArrayList): " + numbers);

       
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending (ArrayList): " + numbers);
        
        
        Collections.shuffle(numbers);
        System.out.println("Shuffled Order: " + numbers);
    }
}