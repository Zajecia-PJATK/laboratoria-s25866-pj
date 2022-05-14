import java.util.*;
class convert {

    public static void main(String[] args) {
        String napistemp;
        String[] napisarray;
        String[] napisarray2;
        int dlugosc;
        Scanner text =new Scanner(System.in);
        //  System.out.println("podaj napis");

        String napis = text.nextLine();

        // System.out.println(napis);
        napistemp= napis.toUpperCase();//wszytko do małych

        System.out.println(napistemp);
        napistemp= napis.toLowerCase();//wszytko do dużych

        System.out.println(napistemp);
        //tylko pierwsza litera duża
        napisarray= napis.split("");
        napisarray[0]=napisarray[0].toUpperCase();
        dlugosc = napisarray.length;
        //System.out.println(dlugosc);
        for(int i=0;i<dlugosc;i++){
            System.out.print(napisarray[i]);
        }
        System.out.println();
        String[]temp;
        napisarray2= napis.split(" ");
        dlugosc = napisarray2.length;
        //System.out.println(dlugosc);
        for(int i=0;i<dlugosc;i++){
            temp=napisarray2[i].split("");
            temp[0]=temp[0].toUpperCase();
            for (String s : temp) {
                System.out.print(s);
            }
            System.out.print(" ");
        }
    }
}


