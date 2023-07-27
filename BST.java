import java.util.Iterator;
public class BST<K extends Comparable<K>, V> implements Iterable<BST<K, V>.Node<K, V>> {
    public Node<K, V> root;
    private int size;
    @Override
    public Iterator<Node<K, V>> iterator() {
        return null;
    }
    public V consist() {
        return null;
    }
    public class Node<K, V> {
        private K key;
        private V value;
        public Node left;
        private Node<K, V> right;
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
}
