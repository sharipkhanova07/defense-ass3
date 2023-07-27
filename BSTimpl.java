import java.util.function.Consumer;
public class BSTimpl<K extends Comparable<K>, V> extends bst<K, V> implements BSTimpl1 {
    @Override
    public void forEach(Consumer<? super Node<K, V>> action) {
        super.forEach((Consumer<? super Node<K, V>>) action);
    }
}