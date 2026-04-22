public class LibraryBST {
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
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    boolean isValidBST(Node node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.key <= min) || (max != null && node.key >= max)) {
            return false;
        }
        return isValidBST(node.left, min, node.key) && isValidBST(node.right, node.key, max);
    }

    public static void main(String[] args) {
        LibraryBST tree = new LibraryBST();
        int[] isbns = {50, 30, 70, 20, 40, 60, 80, 10, 25};
        
        for (int isbn : isbns) {
            tree.insert(isbn);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder();

        System.out.println("Is Valid BST: " + tree.isValidBST(tree.root, null, null));
    }
}
