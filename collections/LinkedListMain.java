package codePractics.collections.collections;
//class Node {
//    public Node next;
//    public int data;
//    public Node(int data) {
//        this.data = data;
//    }
//}
class LinkedList{
    public static void insert(int data, Node head, int pos)
    {
        Node n=new Node(data);
        if(pos==0)
        {
            n.next=head;
            head=n;
        }

        Node prev=head;
        for(int i=0;i<pos-1;i++)
        {
            prev=prev.next;
        }
        n.next=prev.next;
        prev.next=n;

    }
    public static void traverse(Node head)
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }


    public static void delete(Node head, int pos)
    {
        if(pos==0)
        {
            head=head.next;
        }
        else
        {
            Node prev=head;
            for(int i=0;i<pos-1;i++)
            {
                prev=prev.next;
            }
            prev.next=prev.next.next;
        }
    }

}
public class LinkedListMain {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        LinkedList.traverse(head);
        LinkedList.insert(74, head, 3);
        LinkedList.traverse(head);
    }

}
