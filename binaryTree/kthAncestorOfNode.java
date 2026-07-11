package binaryTree;

public class kthAncestorOfNode {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int KAncestorOfNode(Node root, int n, int k){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = KAncestorOfNode(root.left, n, k);
        int rightDist = KAncestorOfNode(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;
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

        KAncestorOfNode(root, 5, 1);

    }

}
