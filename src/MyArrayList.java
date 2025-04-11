public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    @Override
    public void add(T item) {
        if (length == elements.length) {
            increaseBuffer();
        }
        elements[length++] = item;
    }
    private void increaseBuffer() {
        Object[] newElements = new Object[length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + length);
        }
    }


    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        length--;
    }

    public boolean remove(T item) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

}
