import java.util.*;
import java.lang.*;
class NLA {
    public static void main(String[] args) {
        char napis;
        Scanner link = new Scanner(System.in);
        napis = link.next().charAt(0);
        int napis_int=napis;
        if(napis_int>=122){
            napis_int=96;
        }
        napis_int=napis_int+1;
        napis=(char)napis_int;
        System.out.println(napis);

    }}




