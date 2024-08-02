package Collection;


import java.util.Iterator;
import java.util.NoSuchElementException;

class CollectionArray01<T> implements Iterable<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public CollectionArray01() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[index++];
        }
    }

    public static void main(String[] args) {
        CollectionArray01<String> list = new CollectionArray01<>();
        list.add("Mridul");
        list.add("Komal");
        list.add("Sakshi");
        list.add("Samir");
        list.add("Kajal");
        list.add("Mira");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
