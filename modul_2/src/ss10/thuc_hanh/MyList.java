package ss10.thuc_hanh;

import java.util.Arrays;

public class MyList<E> {
    private int size =0  ;
    private  int DEFAULT_CAPACITY = 10;
    private Object[] element ;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCape() {
        int newsize = element.length * 2;
        element = Arrays.copyOf(element, newsize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCape();
        }
        element[size++] = e ;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
