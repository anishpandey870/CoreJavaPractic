package codePractics.collections.genericLinkedList;

public class LinkedListCustom<T> {
   public Node<T> head;
   public Node<T> tail;

//    public LinkedListCustom() {
//        this.head = head;
//    }
   public void addFirst(T data){
        if(isEmpty()){
            head= new Node(data);
            tail=head;
            return;
        }
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
   }
   public void addLast(T data){
       if(isEmpty()){
           head= new Node<T>(data);
           tail=head;
           return;
       }
       Node<T> new_node= new Node<>(data);
       tail.next=new_node;
       tail=new_node;
   }
   public void addPosition(int pos,T data){
        if(pos==1){
            addFirst(data);
            return;
        }
        Node<T> current =head;
        int count =1;
        while(count <pos-1){
            count++;
            current=current.next;
        }
        Node<T> new_node=new Node<>(data);
        new_node.next=current.next;
        current.next=new_node;
   }
   public T deleteFirst(){
        if (isEmpty()){
            throw new RuntimeException("list is empty");
        }
        Node<T> current =head;
        head=head.next;
        current.next=null;
        if(isEmpty()){
            tail=null;
        }
        return current.data;
   }
   public T deleteLast(){
       if (isEmpty()){
           throw new RuntimeException("list is empty");
       }
       if(head==tail){
           T data=head.data;
           head=null;
           tail=null;
           return data;
       }
       Node<T> current =head;
       Node prev=null;
       while (current.next!=null){
           prev=current;
           current=current.next;
       }
       prev.next=null;
       tail=prev;
       return current.data;
   }
   public T deletePos(int pos){
       if (isEmpty()){
           throw new RuntimeException("list is empty");
       }
       if(pos==1){
           deleteFirst();
       }
       Node<T> current=head;
       Node<T> prev=null;
       int count=1;
       while (count<pos){
           count++;
           prev=current;
           current=current.next;
       }
       prev.next=current.next;
       current.next=null;
       return current.data;
   }

   public boolean isEmpty(){
        return head==null;
   }
   public boolean search(T data){
        Node<T> current =head;
        while (current!=null){
            if(data== current.data){
                return true;
            }
            current=current.next;
        }
        return false;
   }
   public void print(){
        Node<T> current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
   }

}
