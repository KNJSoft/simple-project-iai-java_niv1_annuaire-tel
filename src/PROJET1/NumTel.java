package PROJET1;
import java.util.*;
public class NumTel {
    //constantes
    public static final char PROF='T';
    public static final char DOM='D';
    public static final char PORTABLE='P';
    public static final char FAX='F';
    public static final char INCONNU='?';
    //attributs de l'objet
    private int numero;
    private char type;
    //constructeur
    public  NumTel(int num,char type){
        this.numero=num;
        switch (type){
            case PROF -> this.type=type;
            case DOM -> this.type=type;
            case PORTABLE -> this.type=type;
            case FAX -> this.type=type;
            default -> this.type=INCONNU;
        }
    }
    public String toString() {
        return numero + " (" + type + ")";
    }
    public static boolean equal(Object o){
        if(! (o instanceof NumTel)){
            System.out.println("n'exite pas");
            return false;
        }else {
            System.out.println("existe");
            return true;
        }
    }

}