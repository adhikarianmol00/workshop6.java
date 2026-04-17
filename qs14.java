package workshop6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class qs14 {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(45, 12, 89, 7, 33, 21, 56));

        
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        int target = 33;

       
        int resultIndex = binarySearch(numbers, target);

       
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }

    /**
     * Manual implementation of Binary Search
     */
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (list.get(mid) == target) {
                return mid; 
            }

            if (list.get(mid) < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }
}