import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Integer> {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
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
        if (o instanceof Integer) {
            Node node = head;
            return contains(node, (Integer) o);
        } else {
            return false;
        }
    }

    private boolean contains(Node node, Integer integer) {
        if (node != null) {
            if (node.data == integer) {
                return true;
            } else if (integer < node.data) {
                return contains(node.left, integer);
            } else {
                return contains(node.right, integer);
            }
        } else {
            return false;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        Node next = new Node(integer);
        return add(head, next);
    }

    @Override
    public String toString() {
        return toString(head);
    }

    private String toString(Node node) {
        String result = "";
        result += node.data + " ";
        if (node.left != null) {
            result += toString(node.left);
        }
        if (node.right != null) {
            result += toString(node.right);
        }
        return result;
    }

    private boolean add(Node currentNode, Node next) {
        if (isEmpty()) {
            head = next;
            size++;
        } else {
            if (next.data < currentNode.data) {
                if (currentNode.left == null) {
                    size++;
                    currentNode.left = next;
                } else {
                    add(currentNode.left, next);
                }
            } else if (next.data > currentNode.data) {
                if (currentNode.right == null) {
                    size++;
                    currentNode.right = next;
                } else {
                    add(currentNode.right, next);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }
}
