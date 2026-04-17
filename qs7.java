package workshop6;

import java.util.ArrayDeque;

public class qs7 {
    public static void main(String[] args) {
       
        ArrayDeque<String> printQueue = new ArrayDeque<>();

      
        printQueue.addLast("Document1");
        printQueue.addLast("Document2");
        printQueue.addLast("Document3");
        System.out.println("Initial Queue: " + printQueue);

       
        String completedJob = printQueue.pollFirst();
        System.out.println("Printing now: " + completedJob);

      
        printQueue.addLast("Document4");
        printQueue.addLast("Document5");

       
        String nextJob = printQueue.peekFirst();
        System.out.println("Next in line (Peek): " + nextJob);

        
        System.out.println("Remaining Jobs in Queue: " + printQueue);
    }
}