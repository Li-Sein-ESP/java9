import java.util.*;


public class AffectationHashMap {
    private Map<Employe, Departement> empDep = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        empDep.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> e : empDep.entrySet()) {
            System.out.println(e.getKey().getNom() + " : " + e.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        empDep.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (empDep.containsKey(e) && empDep.get(e).equals(d)) {
            empDep.remove(e);
        }
    }

    public void afficherEmploye(Employe e) {
        Set<Employe> emps = empDep.keySet();
        for (Employe emp : emps) {
            System.out.println(emp.getNom() + " : " + empDep.get(emp));
        }
        //empDep.keySet().forEach(employee -> {System.out.println(employee);});
    }

    public void afficherDepartement(Departement d) {
        Collection<Departement> deps = empDep.values();
        for (Departement emp : deps) {
            System.out.println(empDep.get(emp));
            // empDep.values().forEach(departement -> {System.out.println(departement);});
        }
    }
        boolean rechercherEmploye (Employe e){
            return empDep.containsKey(e);
        }
        boolean rechercherDepartement (Departement d){
            return empDep.containsValue(d);
        }
        public TreeMap<Employe, Departement> trierMap () {
            TreeMap<Employe, Departement> treeMap = new TreeMap<>(Comparator.comparingInt(Employe::getId));
            //TreeMap<Employe,Departement> treemap = new TreeMap<>(new ComparatorEmpByID());
            treeMap.putAll(empDep);

            return treeMap;
        }
    }
