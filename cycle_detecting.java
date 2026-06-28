import org.w3c.dom.Node;

public class cycle_detecting {
        public static class Node{
        Node next;

        public Node(int data){
            this.next = null;
        }
    }

    public static Node head;

    public static boolean isCycle(){ //floyd's cycle detecting algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true; // cycle exists
            }
        }

        return false; // cycle doesn't exist
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // 1->2->3->1
        System.out.println(isCycle());
    }
}
