package workshop6;

import java.util.Stack;

public class qs6 {
    public static void main(String[] args) {
        String input = "Hello World";
        
        
        String[] words = input.split(" ");
        Stack<String> stack = new Stack<>();

        
        for (String word : words) {
            stack.push(word);
        }

        
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop());
            
            
            if (!stack.isEmpty()) {
                reversedSentence.append(" ");
            }
        }

       
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedSentence.toString());
    }
}