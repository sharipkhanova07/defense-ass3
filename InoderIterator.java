import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
class bst<K extends Comparable<K>, V> implements Iterable<bst<K, V>.Node<K, V>> {
    private Node<K, V> root;
    private int size;
    public class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> left, right;
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public void put(K key, V value) {
        }

    public V get(K key) {
       return null;
    }

    public void delete(K key) {
        }

    public int size() {
        return size;
    }

    public Iterator<Node<K, V>> iterator() {
        return new InorderIterator(root);
    }

    private class InorderIterator implements Iterator<Node<K, V>> {
        private Node<K, V> current;
        private Stack<Node<K, V>> stack;

        public InorderIterator(Node<K, V> root) {
            current = root;
            stack = new Stack<>();
            populateStack(current);
        }

        private void populateStack(Node<K, V> node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        public Node<K, V> next() {
            if (!hasNext())
                throw new NoSuchElementException();

            Node<K, V> node = stack.pop();
            populateStack(node.right);

            return node;
        }
    }
    public static void main(String[] args) {
    }
}