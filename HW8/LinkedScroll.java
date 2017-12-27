import java.util.Collection;
import java.util.Iterator;

public class LinkedScroll implements Collection {
    private LinkedScroll.Node head;
    private int size = 0;

    public LinkedScroll() {
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean contains(Object o) {
        LinkedScroll.Node temp = this.head;

        boolean result;
        for(result = false; temp.next != null; temp = temp.next) {
            if (temp.data == o) {
                result = true;
                break;
            }
        }

        if (temp.data == o) {
            result = true;
        }

        return result;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        Object[] array = new Object[this.size()];
        LinkedScroll.Node temp = this.head;
        if (this.isEmpty()) {
            return new Object[0];
        } else {
            for(int i = 0; i < this.size(); ++i) {
                array[i] = temp.data;
                temp = temp.next;
            }

            return array;
        }
    }

    public Object[] toArray(Object[] a) {
        if (this.isEmpty()) {
            a = new Object[0];
            return a;
        } else {
            a = this.toArray();
            return a;
        }
    }

    public boolean add(Object o) {
        LinkedScroll.Node addition = new LinkedScroll.Node(o);
        if (this.head == null) {
            this.head = addition;
        } else {
            LinkedScroll.Node temp;
            for(temp = this.head; temp.next != null; temp = temp.next) {
                ;
            }

            temp.next = addition;
        }

        ++this.size;
        return false;
    }

    public boolean remove(Object o) {
        LinkedScroll.Node temp = this.head;
        if (!this.contains(o)) {
            return false;
        } else {
            while(temp.next.data != o) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            --this.size;
            return true;
        }
    }

    public boolean containsAll(Collection c) {
        if (this.isEmpty()) {
            return false;
        } else {
            Object[] array = c.toArray();
            boolean result = true;
            Object[] var4 = array;
            int var5 = array.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Object i = var4[var6];
                if (!this.contains(i)) {
                    result = false;
                    break;
                }
            }

            return result;
        }
    }

    public boolean addAll(Collection c) {
        if (this.isEmpty()) {
            return false;
        } else {
            Object[] array = c.toArray();
            Object[] var3 = array;
            int var4 = array.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Object i = var3[var5];
                this.add(i);
            }

            return false;
        }
    }

    public boolean removeAll(Collection c) {
        if (!this.isEmpty() && this.containsAll(c)) {
            Object[] array = c.toArray();
            Object[] var3 = array;
            int var4 = array.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Object i = var3[var5];
                this.remove(i);
            }

            return false;
        } else {
            return false;
        }
    }

    public boolean retainAll(Collection c) {
        if (this.isEmpty()) {
            return false;
        } else {
            Object[] array = c.toArray();
            Object[] var3 = array;
            int var4 = array.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Object i = var3[var5];
                if (!this.contains(i)) {
                    this.remove(i);
                }
            }

            return true;
        }
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public String toString() {
        Object[] arr = this.toArray();
        String result = "[";
        if (this.isEmpty()) {
            result = null;
        } else {
            for(int i = 0; i < this.size() - 1; ++i) {
                result = result + arr[i] + ", ";
            }

            result = result + arr[this.size() - 1] + "]";
        }

        return result;
    }

    private static class Node {
        private Object data;
        private LinkedScroll.Node next;

        private Node(Object data) {
            this.next = null;
            this.data = data;
        }
    }
}