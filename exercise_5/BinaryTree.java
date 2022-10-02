// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node First
        Node First = new Node("President");
        // Create node Second
        Node Second = new Node("Vice President");
        // Create node Third
        Node Third = new Node("Secretary");
        // Create node Fourth
        Node Fourth = new Node("Treasurer");
        // Create node Fifth
        Node Fifth = new Node("Auditor");
        // Create node Sixth
        Node Sixth = new Node("Chief of Staff");
        // Create node Seventh
        Node Seventh = new Node("SGT. At Arms");

        // Set left and right child of root node First
        First.left = Second;
        First.right = Third;

        // Set left and right child of node Second
        Second.left = Fourth;
        Second.right = Fifth;

        // Set left and right child of node Third
        Third.left = Sixth;
        Third.right = Seventh;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(First);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(First);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(First);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
