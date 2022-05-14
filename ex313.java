import java.util.*;
import java.lang.*;
class number {
    public static char[] DelFrontNull(char[] tablica, int wielkoscTab){
        int temp=0;
        for(int i=0;i<wielkoscTab;i++){
            if(tablica[i]!='0'){
                temp=i;
                break;
            }
        }
        char [] tempTablica = new char [tablica.length-temp];
        for(int i = temp;i<tablica.length;i++){
            tempTablica[i-temp]=tablica[i];
        }
        return tempTablica;

    }
    public static boolean pointcheck(char[] tablica){
        for (int i=0;i< tablica.length;i++){
            if (tablica[i]=='.' || tablica[i]==','){
                return true;
            }
        }
        return false;
    }
    public static boolean UselessZero(char[] tablica){
        if (tablica[tablica.length-1]=='0') return true;
        else return false;
    }
    public static char[] DelBackZero(char[]tablica){
        int temp=0;
        for(int i=tablica.length-1;i>=0;i--){
            if(tablica[i]!='0'){
                temp= tablica.length - i;
                break;
            }
        }
        temp=temp-1;
        char [] tempTablica = new char [tablica.length-temp];
        for(int i=0;i<tempTablica.length;i++){
            tempTablica[i]=tablica[i];
        }
        return tempTablica;
    }

    public static void main(String[] args) {
        String napis;

        Scanner link = new Scanner(System.in);
        napis = link.nextLine();
        //System.out.println(napis);
        char[] tablica = new char[napis.length()];
        for (int i = 0; i < napis.length(); i++) {
            tablica[i] = napis.charAt(i);
        }
        if(tablica[0]=='0'){
            int Size = tablica.length;
            tablica=DelFrontNull(tablica,Size);
            //   System.out.print(tablica);
        }
        if (pointcheck(tablica)){
            if (UselessZero(tablica)){
                tablica=DelBackZero(tablica);
            }
        }
        System.out.print(tablica);
    }
}





