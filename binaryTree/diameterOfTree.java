package binaryTree;

public class diameterOfTree {
        static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    // height calculate
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    //diameter calculate with O(n^2) time complexity
    //this is in so inssufficient because we are calculating height for every node and that is taking O(n) time and we are doing this for every node so it is O(n^2) time complexity");
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }
    
    //diameter calculate with O(n) time complexity-------------------------------------------------------------------------------------------
    static class TreeInfo {
        int diameter;
        int height;

        TreeInfo(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static TreeInfo diameterOptimized(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOptimized(root.left);
        TreeInfo right = diameterOptimized(root.right);

        int selfDiameter = left.height + right.height + 1;
        int maxDiameter = Math.max(selfDiameter, Math.max(left.diameter, right.diameter));
        int height = Math.max(left.height, right.height) + 1;

        return new TreeInfo(maxDiameter, height);
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
        System.out.println("Diameter of the binary tree with O(n^2) time complexity is: " + diameter(root));
        System.out.println("Diameter of the binary tree with O(n) time complexity is: " + diameterOptimized(root).diameter);
    }
}
