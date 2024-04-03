package data.structure.problems;

import java.util.*;

public class TestLinkedList {
        public static void main(String args[]) {
            List<String> al = new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            Iterator<String> itr = al.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println(al);

            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();
            Iterator<Integer> itr1=stack.iterator();
            while(itr1.hasNext()){
                System.out.println(itr1.next());
            }

            PriorityQueue<Integer> pQueue
                    = new PriorityQueue<Integer>();

            // Adding items to the pQueue using add()
            pQueue.add(10);
            pQueue.add(20);
            pQueue.add(15);
            pQueue.add(1);

            // Printing the top element of PriorityQueue
            System.out.println(pQueue.peek());

            // Printing the top element and removing it
            // from the PriorityQueue container
            System.out.println(pQueue.poll());

            // Printing the top element again
            System.out.println(pQueue.peek());
        }
}
