package binaryTree;

public class minDistanceBetweenNoddes {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int findDistance(Node root, int n1, int n2) {
        Node lca = findLowestCommonAncestor(root, n1, n2);
        int d1 = findLevel(lca, n1);
        int d2 = findLevel(lca, n2);
        return d1 + d2;
    }

    public static Node findLowestCommonAncestor(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        };

        Node leftLCA = findLowestCommonAncestor(root.left, n1, n2);
        Node rightLCA = findLowestCommonAncestor(root.right, n1, n2);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }
        return root;
    }

    public static int findLevel(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = findLevel(root.left, n);
        int righttDist = findLevel(root.right, n);

        if (leftDist == -1 && righttDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return righttDist+1;
        } else {
            return leftDist+1;
        }
        
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

        int n1 = 4; 
        int n2 = 7; 

        int distance = findDistance(root, n1, n2);
        System.out.println("Minimum distance between " + n1 + " and " + n2 + " is: " + distance);
    }
}
