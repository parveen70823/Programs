public class linkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // 1.creating a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2.newNode next=head
        newNode.next = head;

        // 3. head =newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
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

    public void print() {// -->o(n )
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Q1. search for a key is a linked list
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    // Q2.Recursive search in a linked list
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Q3. REVERSE A LINKED LIST
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Q4. REMOVE NTH NODE FROM THE END OF THE LL
    public void deleteFromEnd(int n) {// here n is the index of deleted element from the end
        // calculation of size of the ll
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size == n) {
            head = head.next;
            return;
        }

        // size-n
        int i = 1;
        int iTofind = size - n;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }

    private Node midNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;
    }
    // Q5.CHECK THE LL IS PALINDROM OR NOT
    public boolean chechkPalindrom(){
        //step1. find the mid node
        Node mid= midNode(head);

        //step2. reverse 2nd half
        Node curr=mid;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        //.step. check the equality of both the halfes
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);

        // ll.add(2, 9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.itrSearch(897));

        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(86));

        // ll.reverse();
        // ll.print();

        // ll.deleteFromEnd(3);
        // ll.print();

        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.chechkPalindrom());
        
    }
}
