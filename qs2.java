package workshop6;

import java.util.LinkedList;

public class qs2 {
    public static void main(String[] args) {
        
        LinkedList<String> studentList = new LinkedList<>();

        
        checkIfEmpty(studentList);

        
        studentList.addFirst("Anjali");
        studentList.addFirst("Abhinash");

        
        studentList.addLast("Bibek");
        studentList.addLast("Sita");

        
        checkIfEmpty(studentList);

        
        System.out.println("Current Student List: " + studentList);
    }

    
    public static void checkIfEmpty(LinkedList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is currently empty.");
        } else {
            System.out.println("The list is not empty. Total students: " + list.size());
        }
    }
}
