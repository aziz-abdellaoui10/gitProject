import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Employe e1 = new Employe(11111111,"mat1","Aziz","Abdellaoui");
        Employe e2 = new Employe(44444444,"mat5","Selim","Sehli");
        Employe e3 = new Employe(22222222,"mat2","Seif","Ben Karim");
        Employe e4 = new Employe(33333333,"mat3","Fadhel","Jaiet");

        Departement d1 = new Departement(2,"IT");
        Departement d2 = new Departement(1,"QA");


        SocieteHashMap hashMap = new SocieteHashMap(new HashMap<>());
        SocieteTreeMap treeMap = new SocieteTreeMap((new TreeMap<>()));

        hashMap.ajouterEmployeDepartement(e1,d1);
        hashMap.ajouterEmployeDepartement(e2,d2);
        hashMap.ajouterEmployeDepartement(e3,d1);
        hashMap.ajouterEmployeDepartement(e4,d2);

        hashMap.afficherDepartement(e1);
        hashMap.afficherLesDepartements();
        hashMap.afficherLesEmployes();
        hashMap.afficherLesEmployesLeursDepartements();

        System.out.println("-------------------------------");

        treeMap.ajouterEmployeDepartement(e1,d1);
        treeMap.ajouterEmployeDepartement(e2,d2);
        treeMap.ajouterEmployeDepartement(e3,d1);
        treeMap.ajouterEmployeDepartement(e4,d2);

        treeMap.afficherDepartement(e1);
        treeMap.afficherLesDepartements();
        treeMap.afficherLesEmployes();
        treeMap.afficherLesEmployesLeursDepartements();

    }
}