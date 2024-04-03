package data.structure.problems;

import java.util.ArrayList;

public class Sample {

    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(10);
        list1.add(60);

        list2.add(70);
        list2.add(55);
        list2.add(110);


        Node head;


        Node node1 = new Node(1, null);
        head = node1;
        Node node2 = new Node(2, null);
        node1.next = node2;
        Node node3 = new Node(3, null);
        node2.next = node3;
        Node node4 = new Node(4, null);
        node3.next = node4;


//        // print list
//        Node ptr = head;
//        while(ptr != null){
//
//            System.out.println(ptr.value);
//            ptr = ptr.next;
//        }

        // reverse the linked list

        Node pre = null;
        Node curr = head;
        Node next = null;

        while(curr != null){

            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }

        head = pre;

         // print list
        Node ptr = head;
        while(ptr != null){

            System.out.println(ptr.value);
            ptr = ptr.next;
        }




    }
}


class Node{
    int value;
    Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}