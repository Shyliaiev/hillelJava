import java.util.ArrayList;

class Context {
    private SortOrder sortOrder;

    Context(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    ArrayList sorting(ArrayList<Integer> arrayList) {
        return sortOrder.sorting(arrayList);
    }
}
