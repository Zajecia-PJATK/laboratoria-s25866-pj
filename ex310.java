import java.util.Scanner;
import java.util.*;
import java.lang.*;
class SQ {
    public static void main(String[] args) {
        String napis1;//="ala ma kota";
        String napis2;//="ala ma pies";
        int short_str = 0;
        int diff_point=0;
        //System.out.println("Napisy");
        Scanner link = new Scanner(System.in);
        napis1 = link.nextLine();
        napis2 = link.nextLine();
        char[] tablica1 = new char [napis1.length()];
        char[] tablica2 = new char [napis2.length()];
        //System.out.print(napis1.length()+", "+napis2.length());
        if (napis1.length()!=napis2.length()) {
            // System.out.print("rozna dlugosc napisow");
            if (napis1.length() > napis2.length()) {
                short_str = napis2.length();
            } else short_str = napis1.length();
        }
        else short_str=napis1.length();

        for(int i=0;i<napis1.length();i++){
            tablica1[i]=napis1.charAt(i);
        }

        // System.out.println("przekonwertowano napis 1");

        for(int i=0;i<napis2.length();i++){
            tablica2[i]=napis2.charAt(i);
        }
        //System.out.println("przekonwertowano napis 2");

        for(int i= 0;i<short_str;i++){
            // System.out.print(tablica1[i]+"=="+tablica2[i]+" ?");
            if (tablica1[i]!=tablica2[i]){
                diff_point=i;
                //System.out.print("tu napis sie rozni"+i);
                break;
            }

        }

        if (napis1.length()==napis2.length() & diff_point == 0){
            System.out.print("The strings are equal");

        }else System.out.print(diff_point);
    }

}




