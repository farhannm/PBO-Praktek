import java.util.ArrayList;
import java.util.List;

// Iterator interface
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Concrete Iterator
class ListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int position = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        return list.get(position++);
    }
}

// Iterable Collection
class Collection<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public Iterator<T> iterator() {
        return new ListIterator<>(items);
    }
}

// Main
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Collection<String> collection = new Collection<>();
        collection.add("Item1");
        collection.add("Item2");
        collection.add("Item3");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
