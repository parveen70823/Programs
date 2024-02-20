import java.util.*;

import javax.xml.transform.Source;
public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        } 
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    public int RemoveFirst(){
        if(head==null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    } 

    public static int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;
    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2); 
        dll.addFirst(1);
        dll.addFirst(7);
        dll.print(); 

        // dll.reverse();  
        
        // System.out.println("removed element is="+dll.RemoveFirst());
        // dll.print();  
        System.out.println("size is ="+dll.size);

        System.out.println("removed last element is="+ removeLast());
        dll.print();

        
    }
}
