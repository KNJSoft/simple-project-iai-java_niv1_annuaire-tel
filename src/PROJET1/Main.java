package PROJET1;
import java.util.*;
public class Main {
    static ArrayList<NumTel> ListeNumTel = new ArrayList<>();
    private static void affMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("1 : ajouter un numéro au debut de la liste ");
        System.out.println("2 : ajouter un numéro à la fin de la liste ");
        System.out.println("3 : ajouter un numéro à une position donnée ");
        System.out.println("4 : retirer un numéro de la liste ");
        System.out.println("5 : afficher la liste ");
        System.out.println("6 : nombre de numéros de la liste ");
        System.out.println("7 : récupérer le premier de la liste ");
        System.out.println("8 : vérifier la présence d'un numéro dans la liste ");
        System.out.println("9 : afficher la liste en iteration ");
        System.out.println("10: ajouter une personne");
        System.out.println("11: afficher la liste personne");
        System.out.println("0 : quitter l'application ");
        System.out.print("\nVotre choix : ");
    }
    private static NumTel creerNumTel() {
        ArrayList<NumTel> ListeNumTel = new ArrayList<>();
        System.out.print("numero : ");
        int num = PROJET1.LectureClavier.recuperer_num();
        System.out.print("type (T : Fixe professionnel, D : Fixe domicile, P : Portable, F : Fax, ? inconnu)");
        char type = PROJET1.LectureClavier.recuperer_char();
        NumTel Num = new NumTel(num, type);
        return Num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Annuaire annuaire = new Annuaire() {
        };
        ListeNumTel liste = new ListeNumTel() {
        };
        boolean encore = true;
        do {
            affMenu();
            int rep = LectureClavier.recuperer_num();
            switch (rep) {
                case 0:
                    System.out.print("Voulez vous vraimment quitter l'application O/N ");
                    System.exit(0);
                    break;
                case 1:
                    liste.ajouterDebut(creerNumTel());
                    break;
                case 2:
                    liste.ajouterFin(creerNumTel());
                    break;
                case 3:
                    System.out.println("entrer l'index: ");
                    int n = sc.nextInt();
                    liste.ajouter(n, creerNumTel());
                    break;
                case 4:
                    System.out.println("entrer l'index du numero: ");
                    int num = sc.nextInt();
                    liste.retirer(num);
                    break;
                case 5:
                    System.out.println(ListeNumTel);
                    break;
                case 6:
                    System.out.println("nombre de numéros de la liste : " + liste.nbNumeros());
                    break;
                case 7:
                    System.out.println("premier numero de la liste : " + liste.premierNumero());
                    break;
                case 8:
                    System.out.println("entrer le numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("entrer le type: ");
                    char type1 = LectureClavier.recuperer_char();
                    NumTel Num1 = new NumTel(num1, type1);
                    System.out.println(Num1);
                    liste.rechercheNumero(Num1);
                    break;
                case 9:
                    liste.iterator();
                    break;
                case 10:
                    Personne p = annuaire.creerpersonne();
                    ArrayList<Personne> listp = new ArrayList<Personne>();
                    NumTel numero = creerNumTel();
                    annuaire.ajouterNumeroDebut(p, numero);
                    listp.add(p);
                    System.out.println(listp);
                    System.out.println(p);
                    break;
                case 11:
                    annuaire.affich();
                    break;
                default:
                    System.out.println("Mauvais numéro de commande");
                    break;
            } // fin du switch
        } while (true);
    }
}


