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

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

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

        System.out.println("size of linked list is -: " + ll.size);
    }


}



 