import java.util.Comparator;

public class NameComparator implements Comparator<SomeStudent> {
    @Override
    public int compare(SomeStudent o1, SomeStudent o2) {
        return o1.getName().compareTo(o2.getName());
//        return o1.getName().compareTo(o2.getName());
    }
}
