import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "Alice", 22));
        students.add(new Etudiant(2, "Bob", 19));
        students.add(new Etudiant(3, "Charlie", 25));

        StudentManagement sm = new StudentManagement();

        Predicate<Etudiant> ageGreaterThan20 = new Predicate<Etudiant>() {
            @Override
            public boolean test(Etudiant e) {
                return e.getAge() > 20;
            }
        };


        Consumer<Etudiant> printStudent = new Consumer<Etudiant>() {
            @Override
            public void accept(Etudiant e) {
                System.out.println(e);
            }
        };

        sm.displayStudentsByFilter(students, ageGreaterThan20, printStudent);
    }
}
