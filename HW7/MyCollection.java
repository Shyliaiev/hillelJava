import java.util.Collection;
import java.util.Iterator;

//Size+
//isEmpty+
//contains+
//add+
//remove+
//addAll+
//clear+
//retainAll+
//removeAll+
//containsAll


public class MyCollection implements Collection {
    private Object[] data = new Object[0];

    public MyCollection() {
    }

    public Object getData(int i) {
        return data[i];
    }


    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        boolean result = false;
        try {
            if (size() == 0) {
                result = true;
            }
        } catch (NullPointerException NullPointer) {
            result = true;
        }
        return result;
    }

    @Override
    public boolean contains(Object o) {
        boolean result = false;
        for (Object i : data) {
            if (i == o) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Object[] temp = new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            temp[i] = data[i];
        }
        temp[size()] = o;
        data = temp;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        int i, j = 0;
        Object[] temp = new Object[size() - 1];
        if (contains(o)) {
            for (i = 0; i < size() - 1; i++) {
                if (data[i] == o) {
                    j++;
                }
                temp[i] = data[j];
                j++;
            }
            data = temp;
        } else {
            System.out.println("There are no such object here");
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        MyCollection addition = (MyCollection) c;
        for (int i = 0; i < c.size(); i++) {
            add(addition.getData(i));
        }
        return false;
    }

    @Override
    public void clear() {
        data = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        MyCollection temp = (MyCollection) c;
        for (int i = size() - 1; i >= 0; i--) {
            if (temp.contains(data[i])) {
                continue;
            }
            remove(getData(i));
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        MyCollection temp = (MyCollection) c;
        for (int i = 0; i < temp.size(); i++) {
            if (contains(temp.getData(i))) {
                remove(temp.getData(i));
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        MyCollection temp = (MyCollection) c;
        boolean result = true;
        for (int i = 0; i < temp.size(); i++) {
            if (contains(temp.getData(i))) {
                continue;
            }
            result = false;
            break;
        }
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}