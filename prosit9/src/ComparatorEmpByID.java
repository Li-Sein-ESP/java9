import java.util.Comparator;

public class ComparatorEmpByID {
    public int compare(Employe E1, Employe E2) {
        return Integer.compare(E1.getId(), E2.getId());
    }
}