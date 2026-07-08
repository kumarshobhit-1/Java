package binaryTree;

public class countOfTheNode {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int countOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \  /\
                4   56  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Count of the node is: " + countOfNode(root));
    }
}
