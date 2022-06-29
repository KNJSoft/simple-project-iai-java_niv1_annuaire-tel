package PROJET1;
import java.util.*;

import static PROJET1.LectureClavier.sc;
public class Personne {
    Scanner sc=new Scanner(System.in);
    ArrayList<Personne> ListePersonne = new ArrayList<>();
    //valeur possible de la civilité
    public static final int INCONNU=0;
    public static final int MR=1;
    public static final int MME=2;
    public static final int MLLE=3;
    //tableau de chaine de caractère pour faire correspondre une chaine a la civilité
    private static final String[] civil={"","Mr","Mme","Mlle"};
    private String nom;
    private String prenom;
    private int civilite=INCONNU;
    //constructeur avec civilité par defaut
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.civilite=INCONNU;
    }
    //constructeur avec ses parametres
    public Personne(int Civilite,String Nom,String Prenom){
        nom=Nom;
        prenom=Prenom;
        if(Civilite!=INCONNU){
            civilite=Civilite;
        }else {
            civilite=INCONNU;
        }
    }
    public void setCIVIL(int Civilite){
        if(Civilite!=INCONNU){
            switch (civilite){
                case INCONNU -> civilite=Civilite;

                case MLLE -> {
                    if(Civilite==MME){
                        civilite=MME;
                    }
                    break;
                }
            }
        }
    }
    public  Personne creerper(){
        int civilite1=sc.nextInt();
        String nom1=sc.nextLine();
        String prenom1=sc.nextLine();
        Personne per=new Personne(civilite1,prenom1,nom1);

        return per;
    }
}