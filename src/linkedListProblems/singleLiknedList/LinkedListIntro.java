package linkedListProblems.singleLiknedList;

public class LinkedListIntro {
    public static void main(String[] args) {
        System.out.println("checking");
        int n = 5;
        Node head = new Node(15);
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