import java.util.Comparator;

public class IdComparator implements Comparator<SomeStudent> {
    @Override
    public int compare(SomeStudent o1, SomeStudent o2) {
        return Integer.compare(o1.getId(), o2.getId());
//        return (o1, o2) -> o1.getId() < o2.getId() ? -1 : o1.getId() == o2.getId() ? 0 : 1);
    }
}
