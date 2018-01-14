import java.util.ArrayList;
import java.util.Comparator;

public class EvenOdd implements SortOrder{
    @Override
    public ArrayList sorting(ArrayList<Integer> arrayList) {
        arrayList.sort(Comparator.naturalOrder());
        arrayList.sort(((o1, o2) -> (o1 % 2 == 0 && o2 % 2 != 0) ? -1 : ((o1.equals(o2)) ? 0 : 1)));
        System.out.println("Тут мы вызвали сортировку четные-нечетные");
        return arrayList;
    }
}
