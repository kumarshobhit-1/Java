package binaryTree;

public class transformSumTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int transform(Node root){
        if (root == null) return 0;

        int leftChild = transform(root.left);
        int righttChild = transform(root.right);

        int data = root.data;


        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild +  newRight + righttChild;
        return data;
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /* main tree
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


        transform(root);
        preOrder(root);
    }
}
