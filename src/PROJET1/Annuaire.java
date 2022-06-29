package PROJET1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import  PROJET1.*;
public interface Annuaire {
    ArrayList <Personne> listp=new ArrayList<Personne>();
    ArrayList<Ass> ListeAss = new ArrayList<Ass>();
    ArrayList<NumTel> ntel = new ArrayList<NumTel>();
    Scanner sc=new Scanner(System.in);

    public default boolean ajouterEntree(Personne p, ListeNumTel num){
        Ass a=new Ass(p, (NumTel) num);
        return true;
    } ;
    public default void ajouterNumeroFin(Personne p, NumTel n){


    } ;
    public default void ajouterNumeroDebut(Personne p, NumTel n) {
        Ass numdeb=new Ass(p,n);
        ListeAss.add(numdeb);
        listp.add(p);
        ntel.add(n);
        //List<String> resultList1 = (List<String>) Stream.concat(ntel.stream(), listp.stream());

        //System.out.println(resultList1);
    } ;
    public default NumTel premierNumero(Personne p){
        return null;
    };
    public default ListeNumTel numeros(Personne p){

        return null;
    };
    public default Iterator personne(){

        return null;
    };
    public default void afficher(){

    };
    public default void supprimer(Personne p){

    };
    public default void supprimer(Personne p, int n){

    };
    public class Ass {
        NumTel Num;
        Personne Per;
        //constructeur
        public Ass(Personne per1,NumTel Num1){
            Num=Num1;
            Per=per1;
        }


    }
    public default Personne creerpersonne(){
        String menu="\n0 :' '"+"\n1: Mr"+"\n2: Mme"+"\n3: Mlle";
        System.out.print(menu+"\nvotre choix");
        int c=sc.nextInt();
        String nom=sc.nextLine();
        System.out.println("nom");
        String nom1=sc.nextLine();
        System.out.println("prenom");
        String prenom=sc.nextLine();
        Personne p=new Personne(c,nom1,prenom);
        return p;
    }
    public default void ajou(Personne p,NumTel numero){

    }
    public default void affich(){
        System.out.println(listp+" "+ntel);
    }

}