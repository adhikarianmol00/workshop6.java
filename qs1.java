package workshop6;

import java.util.ArrayList;

public class qs1 {
    public static void main(String[] args) {
        
        ArrayList<String> examinees = new ArrayList<>();

       
        examinees.add("Alice");
        examinees.add("Suresh");
        examinees.add("Priya");
        examinees.add("Abhinash");
        examinees.add("David");

        System.out.println("Initial List: " + examinees);

       
        examinees.remove("David");

        
        System.out.println("Final Examinee List: " + examinees);
        
    
        System.out.println("Total students appearing: " + examinees.size());
    }
}
