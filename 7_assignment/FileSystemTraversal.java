public class FileSystemTraversal {
    static class Node {
        String name;
        Node left, right;

        Node(String name) {
            this.name = name;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.left = new Node("home");
        root.right = new Node("var");
        root.left.left = new Node("user");
        root.right.left = new Node("docs");
        root.right.right = new Node("log");
        root.right.left.left = new Node("config");

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }

    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.name + " ");
        inorder(node.right);
    }

    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        preorder(node.left);
        preorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.name + " ");
    }
}
