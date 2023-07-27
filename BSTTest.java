public class BSTTest {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Value 5");
        bst.put(3, "Value 3");
        bst.put(7, "Value 7");
        bst.put(2, "Value 2");
        bst.put(4, "Value 4");
        bst.put(6, "Value 6");
        bst.put(8, "Value 8");

        System.out.println("BST is consistent: " + bst.consist());

        bst.root.left.left = bst.new Node<>(6, "Value 6");
        System.out.println("BST is consistent: " + bst.consist());
    }
}
