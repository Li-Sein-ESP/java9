import java.util.TreeSet;

public interface IDepartement <T>{
    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void DisplayDepartement();
    public TreeSet<T> trierDepartementById();
}
