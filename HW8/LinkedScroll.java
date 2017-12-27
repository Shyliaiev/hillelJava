import java.util.Collection;
import java.util.Iterator;

public class LinkedScroll implements Collection {

    private static class Node {
        private Object data;

        private Node next = null;

        private Node(Object data) {
            this.data = data;
        }
    }

    private Node head;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node temp = head;
        boolean result = false;
        while (temp.next != null) {
            if (temp.data == o) {
                result = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        if (temp.data == o) {
            result = true;
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node temp = head;
        if (isEmpty()) {
            return new Object[0];
        }
        for (int i = 0; i < size(); i++) {
            array[i] = temp.data;
            temp = temp.next;
        }
        return array;
    }

    @Override
    public Object[] toArray(Object[] a) {
        //по идее в этом коде нет необходимости
        if (isEmpty()) {
            a = new Object[0];
            return a;
        }
        //
        a = toArray();
        return a;
    }

    @Override
    public boolean add(Object o) {
        Node addition = new Node(o);
        Node temp;
        if (head == null) {
            head = addition;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = addition;
        }
        size++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node temp = head;
        if (contains(o)) {
            while (temp.next.data != o) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection c) {
        if (isEmpty()) {
            return false;
        }
        Object[] array = c.toArray();
        boolean result = true;
        for (Object i : array) {
            if (contains(i)) {
                continue;
            }
            result = false;
            break;
        }
        return result;
    }

    @Override
    public boolean addAll(Collection c) {
        if (isEmpty()) {
            return false;
        }
        Object[] array = c.toArray();
        for (Object i:array) {
            add(i);
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (isEmpty()||!containsAll(c)) {
            return false;
        }
        Object[] array = c.toArray();
        for (Object i:array) {
            remove(i);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (isEmpty()) {
            return false;
        }
        Object[] array = c.toArray();
        for (Object i:array) {
            remove(i);
        }
        return true;
    }

    @Override
    public void clear() {
        this.head = null;
        size = 0;
    }

    @Override
    public String toString() {
        Object[] arr = toArray();
        String result = "[";
        if (isEmpty()) {
            result = null;
        } else {
            for (int i = 0; i < size() - 1; i++) {
                result += (arr[i] + ", ");
            }
            result += arr[size() - 1] + "]";
        }
        return result;
    }
}
