package codePractics.collections.collections;

class StackLink{
    Node head;
    int size;
    public StackLink()
    {
        head=null;
        size=0;
    }
    public void push(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        size++;
        head=temp;

    }
    public void peek() throws Exception
    {
        if(head==null)
        {
            throw new Exception();
        }
        System.out.println(head.data);
    }
    public int pop() throws Exception
    {
        if(head==null)
        {
            throw new Exception();
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public  int size()
    {
        return size;
    }

}
public class StackMain {
    public static void main(String[] args) throws Exception {
        StackLink my=new StackLink();
        my.push(10);
        my.push(20);
        my.push(40);
        my.push(50);
        my.push(80);
        my.push(180);
        my.peek();
        my.pop();
        my.isEmpty();
        my.size();

    }

}
