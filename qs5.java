package workshop6;

import java.util.Stack;

public class qs5 {
    public static void main(String[] args) {
        
        Stack<String> tasks = new Stack<>();

        
        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");
        System.out.println("Initial Stack: " + tasks);

        
        String removedTask = tasks.pop();
        System.out.println("Popped Task: " + removedTask);

        
        tasks.push("Debug");
        tasks.push("Test");

       
        String topTask = tasks.peek();
        System.out.println("Top Task (Peek): " + topTask);

        
        System.out.println("Final Task Stack: " + tasks);
    }
}