import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement{

    Set<Departement> departements = new HashSet<Departement>();

    @Override
    public void ajouterDepartement(Object object) {
    Departement departement = (Departement) object;
    departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if (dep.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Object object) {
        if (object instanceof Departement)
            return departements.contains(object);
        else
            return false;
    }

    @Override
    public void supprimerDepartement(Object object) {
        if (object instanceof Departement) {
            Departement dep = (Departement) object;
            if (departements.remove(dep)) {
                System.out.println("Département supprimé : " + dep);
            } else {
                System.out.println("Département introuvable : " + dep);
            }
        } else {
            System.out.println("Objet invalide. Veuillez fournir un département.");
        }
    }

    @Override
    public void DisplayDepartement() {
        System.out.println("Liste des départements :");
        for (Departement dep : departements) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(new ComparatorByid());
        sortedDepartements.addAll(departements);
        return sortedDepartements;
    }
}
