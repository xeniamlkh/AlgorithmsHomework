package lesson6;

public class Main {

    private Node root;

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;

        }
    }

    public void put(int data) {
        root = put(root, data);
    }

    private Node put(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = put(node.left, data);
        } else if (data > node.data) {
            node.right = put(node.right, data);
        } else {
            return node;
        }
        return node;
    }

    public static int isHeightBalanced(Node node) {

        if (node == null) {
            return 0;
        }

        int left_height = isHeightBalanced(node.left);
        if (left_height == -1) {
            return -1;
        }

        int right_height = isHeightBalanced(node.right);
        if (right_height == -1) {
            return -1;
        }

        int height = Math.abs(right_height - left_height);
        if (height > 1) {
            return -1;
        } else {
            return Math.max(left_height, right_height) + 1;
        }
    }

    public static boolean isBalanced(Node root) {

        if (isHeightBalanced(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean createTree() {

        Main myTree = new Main();

        for (int i = 0; i < 6; i++) {
            myTree.put((int) (Math.random() * ((100 - (-100) + 1)) + (-100)));
        }

        if (isBalanced(myTree.root) == false) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.left) + " " + node.data + " " + toString(node.right);
    }

    public static void main(String[] args) {
        int n = 100000;
        int count_unbalanced = 0;
        int count_balanced = 0;
        boolean result;

        for (int i = 0; i < n; i++) {

            result = createTree();
            if (result == false) {
                count_unbalanced += 1;
            } else {
                count_balanced += 1;
            }

        }

        System.out.println("Percent of unbalanced trees is " + (100 * count_unbalanced / n));

    }
}
