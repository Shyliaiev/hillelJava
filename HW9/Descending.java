import java.util.ArrayList;
import java.util.Comparator;

public class Descending implements SortOrder{
    @Override
    public ArrayList sorting(ArrayList<Integer> arrayList) {
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("Тут мы вызвали сортировку по убыванию");
        return arrayList;
    }
}
