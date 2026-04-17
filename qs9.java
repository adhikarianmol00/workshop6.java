package workshop6;

import java.util.HashSet;
import java.util.Set;

public class qs9 {
    public static void main(String[] args) {
        
        HashSet<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        
        System.out.println("Set 1 (Group A): " + set1);
        System.out.println("Set 2 (Group B): " + set2);
        System.out.println("-----------------------------------");

        
        Set<String> union = performUnion(set1, set2);
        System.out.println("Union (All unique animals): " + union);

       
        Set<String> intersection = performIntersection(set1, set2);
        System.out.println("Intersection (Common animals): " + intersection);

        
        Set<String> difference = performDifference(set1, set2);
        System.out.println("Difference (In Set 1 but not Set 2): " + difference);
    }

   
    public static Set<String> performUnion(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

   
    public static Set<String> performIntersection(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }

    
    public static Set<String> performDifference(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.removeAll(s2);
        return result;
    }
}