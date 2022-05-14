import java.util.*;
import java.lang.*;
class FNF {
    //find name file
    public static void main(String[] args) {
        String napis;
        int temp = 0;
        //System.out.println("Napis");
        Scanner link = new Scanner(System.in);
        napis = link.nextLine();
        char[] tablica = new char [napis.length()];
        //System.out.println(napis.length());
        for(int i=0;i<napis.length();i++){
            tablica[i]=napis.charAt(i);

        }
        // System.out.println(napis.length());
        for(int i=napis.length()-1;i>=0;i--){
            //System.out.print(tablica[i]);
            if(tablica[i]=='/'){
                temp=i;
//                System.out.print("znaleziono \"/\" na miejscu " + i );
                break;
            }
//            else{
//                if (i==0){
//                    System.out.println("nie da sie wydzielic pliku");
//                }
//
//            }

        }
        //System.out.print("\n");
        for(int i= temp+1;i<napis.length();i++){
            System.out.print(tablica[i]);
        }

    }

}
