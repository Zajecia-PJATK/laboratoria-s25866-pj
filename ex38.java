import java.util.*;
import java.lang.*;
class FUN {
    //find user name


    public static void main(String[] args) {
        String napis;
        int temp=1;
        //  System.out.println("Napis");
        Scanner link = new Scanner(System.in);
        napis = link.nextLine();
        char[] tablica = new char [napis.length()];
        //System.out.println(napis.length());
        for(int i=0;i<napis.length();i++){
            tablica[i]=napis.charAt(i);

        }
        // System.out.println(napis.length());
        for(int i=0;i<napis.length();i++){
            //System.out.print(tablica[i]);
            if(tablica[i]=='@'){
                temp=i;
                //System.out.print("znaleziono \"@\" na miejscu " + i );
                break;
            }
//            else{
//                if (i==0){
//                    System.out.println("nie da sie wydzielic nazwy");
//                }

            //  }

        }
        //System.out.print("\n");
        for(int i=0;i<temp;i++){
            System.out.print(tablica[i]);
        }

    }

}





