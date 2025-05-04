import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instancier la société
        SocieteArrayList societe = new SocieteArrayList();

        // Ajouter les employés à la société
        Employe e1 = new Employe(1, "Ali", "Ahmed", "Informatique", 3);
        Employe e2 = new Employe(3, "Sami", "Khaled", "Finance", 2);
        Employe e3 = new Employe(2, "Ali", "Mohamed", "Marketing", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Afficher les employés avant le tri
        System.out.println("Avant le tri par nom de département et grade :");
        societe.displayEmploye();

        // Trier les employés par nom de département et grade
        System.out.println("######################################");
        societe.trierEmployeParNomDépartementEtGrade();

        // Afficher les employés après le tri
        System.out.println("Après le tri par nom de département et grade :");
        societe.displayEmploye();
    }
}
