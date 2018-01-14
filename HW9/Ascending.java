import java.util.ArrayList;
import java.util.Comparator;

public class Ascending implements SortOrder{
    @Override
    public ArrayList sorting(ArrayList<Integer> arrayList) {
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Тут мы вызвали сортировку по возрастанию");
        return arrayList;
    }
}
