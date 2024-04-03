package data.structure.problems;
public class LinkedListIterative
{

    // head is the first node of the linked list
    static LinkedListNode head;

    // class for creating the node of the linked list
    static class LinkedListNode
    {
        int val;
        LinkedListNode next;
        LinkedListNode(int no)
        {
            val = no;
            next = null;
        }
    }

    // Method for reversing the linked list
    LinkedListNode reverse(LinkedListNode node)
    {
    // doing the initialization of as per the steps defined
        LinkedListNode previous = null;
        LinkedListNode curr = node;
        LinkedListNode next = null;


        while (curr != null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        node = previous;
        return node;
    }

    // displays the content of the linked list
    void printList(LinkedListNode node)
    {
        while (node != null)
        {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    // main method
    public static void main(String argvs[])
    {
// creating an object of the class LinkedListIterative
        LinkedListIterative listObj = new LinkedListIterative();

// 4 -> NULL
        listObj.head = new LinkedListNode(4);

// 4 -> 6 -> NULL
        listObj.head.next = new LinkedListNode(6);

// 4 -> 6 -> 7 -> NULL
        listObj.head.next.next = new LinkedListNode(7);

// 4 -> 6 -> 7 -> 1-> NULL
        listObj.head.next.next.next = new LinkedListNode(1);

// 4 -> 6 -> 7 -> 1-> 5 -> NULL
        listObj.head.next.next.next.next = new LinkedListNode(5);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> NULL
        listObj.head.next.next.next.next.next = new LinkedListNode(8);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> NULL
        listObj.head.next.next.next.next.next.next = new LinkedListNode(3);

// 4 -> 6 -> 7 -> 1-> 5 -> 8 -> 3 -> 2 -> NULL
        listObj.head.next.next.next.next.next.next.next = new LinkedListNode(2);


        System.out.println("The Linked list before reversal is: ");
        listObj.printList(head);
        head = listObj.reverse(head);
        System.out.println("\n");
        System.out.println("After reversal, the linked list is: ");
        listObj.printList(head);
    }
}