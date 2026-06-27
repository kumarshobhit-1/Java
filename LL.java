import java.util.LinkedList;

public static LinkedList{
    public static class Node{
        int data;
        Node next;
    }

    public Node(int data){
        this.data = data;
        this.next = next;
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        
        //step1 = create new node
        Node newNode = new Node(data);

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
}
public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

    }
}
