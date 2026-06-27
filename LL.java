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
}
public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        
    }
}
