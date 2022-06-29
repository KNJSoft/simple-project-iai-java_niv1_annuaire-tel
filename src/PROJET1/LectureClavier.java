package PROJET1;
import java.util.*;
public class LectureClavier {

    static Scanner sc=new Scanner(System.in);
    public static int recuperer_num(){
        int n=sc.nextInt();
        return n;
    }
    public static char recuperer_char(){
        System.out.println("\n1: T\n2: D\n3: P\n4: F\n5: ?");
        char t ;
        System.out.print("votre choix");
        int n=sc.nextInt();
        switch (n){
            case 1:t='T';
            break;
            case 2:t='D';
            break;
            case 3:t='P';
            break;
            case 4:t='F';
            break;
            case 5:t='?';
            break;
            default:t='?';
        }

        return t;
    }
    public static String recuperer_string(){
        System.out.print("mot");
        String t=sc.nextLine().toUpperCase(Locale.ROOT);


        return t;
    }

}