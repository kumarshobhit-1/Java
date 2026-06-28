import org.w3c.dom.Node;

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public static Node head;
    public static Node tail;
    public static int size;

    // Add first node in Linked List
    public void addFirst(int data){
        
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) { //if node is NULL
            head = tail = newNode;
            return;
        }

        // if node one or more
        //step2 - newNode next = head
        newNode.next = head; //link

        //step3 - head = newNode
        head = newNode;

    }

    // Add Last node in Linked List
    public void addLast(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) { //if node is NULL
            head = tail = newNode;
            return;
        }

        // if node one or more
        //step2 - tail.next = newNode
        tail.next = newNode; //link

        //step3 - tail = newNode
        tail = newNode;
    }

    // Add middle node in Linked List
    public void addMiddle(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first node in Linked List
    public int removeFirst(){
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

    // Remove Last node in Linked List
    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }


    // Iterative Search in the linked list
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }

    // helper function with Recursive Search in Linked List
    public int helper(Node head, int key){
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

        return idx+1;
    }
    
    // Recrsive search function 
    public int recSearch(int key){
        return helper(head, key);
    }


    // reverse linked list fuction
    public void reverseLinkedList(){
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

    // printing the linked list
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMiddle(2, 3);
        ll.print();

        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();

        // System.out.println("size of linked list is -: " + ll.size);

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        ll.reverseLinkedList();
        ll.print();
    }


}



 