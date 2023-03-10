import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete{

    HashMap<Employe,Departement> map;

    public SocieteHashMap(HashMap<Employe,Departement> map){
        this.map = map;
    }
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(map);
    }

    @Override
    public void afficherLesEmployes() {
        for(Employe e: map.keySet()){
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for(Departement d: map.values()){
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(map.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        for(Employe em: map.keySet()){
            if(em.equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        for(Departement dep: map.values()){
            if(dep.equals(d)){
                return true;
            }
        }
        return false;
    }
}
