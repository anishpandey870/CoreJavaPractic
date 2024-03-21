package codePractics.collections.genericLinkedList;

import codePractics.collections.linkedList.LinkedListCreation;

public class Node <T>{
   public   T data;
  public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
