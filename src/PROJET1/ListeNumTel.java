package PROJET1;

import java.util.ArrayList;
import java.util.Collection;

public interface ListeNumTel {
    static ArrayList<NumTel> ListeNumTel = new ArrayList<>();
    public default boolean ajouterFin(NumTel num){
        if(!Main.ListeNumTel.contains(num)) {
            Main.ListeNumTel.add(Main.ListeNumTel.size(), num);
        }
        return false;
    }
    public default boolean ajouterDebut(NumTel num){
        if(!Main.ListeNumTel.contains(num)) {
            Main.ListeNumTel.add(0, num);
        }
        return false;
    }
    public default boolean ajouter(int index, NumTel Num){
        if(!Main.ListeNumTel.contains(Num)) {
            Main.ListeNumTel.add(index,Num);
            return true;
        }
        return false;
    }
    public default NumTel premierNumero(){
        return Main.ListeNumTel.get(0);
    }
    public default NumTel numero(int index) {
        return Main.ListeNumTel.get(index);
    }
    public default boolean rechercheNumero(NumTel num){
        if(PROJET1.NumTel.equal(num))
            return true;
        return false;
    }

    public default int nbNumeros(){

        return Main.ListeNumTel.size();
    }
    public String toString() ;
    public default int iterator(){
        int i,s;
        for(i=0;i<Main.ListeNumTel.size();i++) {
            s=i+1;
            System.out.println("N°"+s+": "+Main.ListeNumTel.get(i));

        };
        return 0;
    } ;
    public default boolean retirer(int num){
        if (Main.ListeNumTel.size()>1){
            Main.ListeNumTel.remove(num);
            return true;
        }
        return false;
    };
}