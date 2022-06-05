import java.util.*;

public class MyArrayList<T> {

    Object[] node;
    int size;

    public void add(T t) {

        if (node == null) {
            node = new Object[2];
        } else if (size == node.length - 1) {
            int newSize = ((node.length * 3) / 2) + 1;
            node = Arrays.copyOf(node, newSize);
        }

        node[size] = t;
        size++;
    }

    public T get(int position) {
        return (T) node[position];
    }

}
