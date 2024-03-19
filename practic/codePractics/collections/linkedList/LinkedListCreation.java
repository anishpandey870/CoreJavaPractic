package codePractics.collections.linkedList;

import java.util.Scanner;

public class LinkedListCreation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("do you want add more data if yes then press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void transverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("ll  data not exist");
        } else {
            while (temp != null) {
                System.out.println("ll  data : " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListCreation ll = new LinkedListCreation();
        ll.creation();
        ll.transverse();
    }

}
