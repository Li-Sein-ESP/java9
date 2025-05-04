import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbemploye;


    public Departement(String nom, int id, int nbemploye) {
        this.nom = nom;
        this.id = id;
        this.nbemploye = nbemploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbemploye() {
        return nbemploye;
    }

    public void setNbemploye(int nbemploye) {
        this.nbemploye = nbemploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbemploye=" + nbemploye +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Departement that = (Departement) object;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, nbemploye);
    }
}
