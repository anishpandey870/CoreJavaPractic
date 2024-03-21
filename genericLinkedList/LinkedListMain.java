package codePractics.collections.genericLinkedList;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
      LinkedListCustom<Integer> ll=new LinkedListCustom();
        ll.addFirst(20);
        System.out.print("after adding 20 at first :");
        ll.print();
        ll.addFirst(10);
        System.out.print("after adding 10 at first :");
        ll.print();
        ll.addLast(30);
        System.out.print("after adding 30 at last :");
        ll.print();
        ll.addLast(40);
        System.out.print("after adding 40 at last :");
        ll.print();
        ll.addFirst(5);
        System.out.print("after adding 5 at first :");
        ll.print();
        ll.addPosition(4,25);
        System.out.print("after adding 25  at pos 4 :");
        ll.print();
        ll.deleteFirst();
        System.out.print("after deleting first node :");
        ll.print();
        ll.deleteLast();
        System.out.print("after deleting last node :");
        ll.print();
        ll.deletePos(2);
        System.out.print("after deleting node at pos 2 :");
        ll.print();

    }
}
