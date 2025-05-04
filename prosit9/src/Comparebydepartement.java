import java.util.Comparator;

class Comparebydepartement implements Comparator {
    public int compare(Object obj1, Object obj2) {
        // Make sure that the objects are Car objects
        Employe E1 = (Employe) obj1;
        Employe E2 = (Employe) obj2;
    return E1.getDepartement().compareTo(E2.getDepartement());
    }
}