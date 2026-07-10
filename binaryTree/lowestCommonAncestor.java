package binaryTree;
import java.util.ArrayList;

public class lowestCommonAncestor {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // Approach 1: Store the path of both nodes and then compare the paths to find the last common node
    public static Node findLowestCommonAncestor(Node root, int n1, int n2) { // O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        //last equal node -> i-1th node
        Node lca =  path1.get(i - 1);
        return lca;
    }

    // Approach 2: Recursive approach to find the lowest common ancestor without storing paths
    public static Node findLowestCommonAncestorRecursive(Node root, int n1, int n2) { // O(n)
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        };

        Node leftLCA = findLowestCommonAncestorRecursive(root.left, n1, n2);
        Node rightLCA = findLowestCommonAncestorRecursive(root.right, n1, n2);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }
        return root;
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

        Node lca = findLowestCommonAncestor(root, n1, n2);
        System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lca.data);

        Node lca2 = findLowestCommonAncestorRecursive(root, n1, n2);
        System.out.println("Lowest Common Ancestor (Recursive) of " + n1 + " and " + n2 + " is: " + lca2.data);
    }
}
