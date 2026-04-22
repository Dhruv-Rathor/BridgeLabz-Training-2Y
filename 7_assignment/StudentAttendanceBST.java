public class StudentAttendanceBST {
    static class Node {
        int key;
        Node left, right;
        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }

    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;
        if (key < root.key) root.left = deleteRec(root.left, key);
        else if (key > root.key) root.right = deleteRec(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void printRange(Node node, int k1, int k2) {
        if (node == null) return;
        if (k1 < node.key) printRange(node.left, k1, k2);
        if (k1 <= node.key && k2 >= node.key) System.out.print(node.key + " ");
        if (k2 > node.key) printRange(node.right, k1, k2);
    }

    public static void main(String[] args) {
        StudentAttendanceBST tree = new StudentAttendanceBST();
        int[] rolls = {15, 10, 20, 8, 12, 17, 25};
        for (int r : rolls) tree.insert(r);

        tree.delete(10);
        tree.insert(14);
        tree.insert(9);

        System.out.print("Students between 10 and 20: ");
        tree.printRange(tree.root, 10, 20);
        System.out.println();
    }
}
