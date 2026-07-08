package binaryTree;

public class heightOfTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    // height calculate In Node Form
    public static int heightInNodeForm(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightInNodeForm(root.left);
        int rightHeight = heightInNodeForm(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
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

        System.out.println("Height of the tree is: " + heightInNodeForm(root));
    }
}
