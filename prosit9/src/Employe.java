import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String Departement;
    private int grade;

    // Constructeur sans paramètre
    public Employe() {}

    // Constructeur avec paramètres
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Departement = nomDepartement;
        this.grade = grade;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return Departement;
    }

    public void setDepartement(String Departement)  {
        this.Departement = Departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }






    // Redéfinition de la méthode equals (basée sur id et nom)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", Departement='" + Departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe E) {
       return this.id-E.id;
    }
}
