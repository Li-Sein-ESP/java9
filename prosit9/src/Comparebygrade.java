import java.util.Comparator;
public class Comparebygrade {
    public int compare(Object obj1, Object obj2) {
        Employe E1 = (Employe) obj1;
        Employe E2 = (Employe) obj2;
        return E1.getGrade()-E2.getGrade(); // Both cars have the same year
    }
}

