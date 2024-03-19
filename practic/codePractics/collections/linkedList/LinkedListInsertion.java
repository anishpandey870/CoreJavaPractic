package codePractics.collections.linkedList;

import java.util.Scanner;

public class LinkedListInsertion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void creation(){
        int data, n,m,p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.print("enter 1 to insert item at begining,2 to insertat end,3 to insert item at position location :");
               m =sc.nextInt();
               switch(m){
                   case 1:
                       new_node.next = head;
                       head = new_node;
                       break;
                   case 2:
                       Node temp=head;
                       while(temp.next!=null){
                           temp=temp.next;
                       }
                       temp.next=new_node;
                       break;
                   case 3:
                    System.out.print("enter position of node to be inserted :");
                    p=sc.nextInt();
                    Node temp1=head;
                    for(int i=0;i<(p-1);i++){
                        temp1=temp1.next;
                    }
                    new_node.next=temp1.next;
                    temp1.next=new_node;
                    break;
               }

            }
            System.out.print("do you want add more data if yes then press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }
    public void transverse() {
        Node temp = head;
        if (temp == null) {
            System.out.print("ll  data not exist :");
        } else {
            while (temp != null) {
                System.out.println("ll  data : " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListInsertion ll = new LinkedListInsertion();
        ll.creation();
       ll.transverse();
    }
}
