import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        for (Etudiant etu : students) {
            con.accept(etu);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etu : students) {
            if (pre.test(etu)) {
                con.accept(etu);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        StringBuilder result = new StringBuilder();
        for (Etudiant etu : students) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(fun.apply(etu)); // Applique la transformation
        }
        return result.toString();
    }


    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get(); // Retourne un nouvel étudiant
    }


    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        students.sort(com); // Trie la liste en place
        return students;
    }


   /* @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
    }
*/

}
