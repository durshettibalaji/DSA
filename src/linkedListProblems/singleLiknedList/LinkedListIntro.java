package linkedListProblems.singleLiknedList;

import java.util.PriorityQueue;

public class LinkedListIntro {
    public static void main(String[] args) {
        System.out.println("checking");
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int n = 5;
        Node head = new Node(0);
        Node node = head;
        while (n > 0) {
            // node = node.next;
            node.next = new Node(n);
            node = node.next;
            n--;
        }
        node = head;
        while (node != null) {
            System.out.println(node.num);
            node = node.next;
        }
    }
}

class Node {
    int num;
    Node next;
    Node(int num) {
        this.num = num;
    }
}









