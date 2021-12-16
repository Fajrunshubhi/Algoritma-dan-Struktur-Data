package singkatan.string;
import java.util.*;
import java.lang.Math;

public class SingkatanString {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        boolean kondisi = true;   
        boolean tadiSpasi = true;
        char singkatan = ' ';

        System.out.print("Kalimat atau kata-kata (masukkan dengan benar): ");
        String kalimat = input.nextLine();
        
        boolean result = false;
        for (int i = 0; i<kalimat.length(); i++){ 
            char huruf = kalimat.charAt(i);
            
            if (tadiSpasi) {
                singkatan =  kalimat.charAt(i);
            }
            if (huruf == '.') {
                result = false;
            } 
            else {
                if (huruf == ' ') {
                    tadiSpasi = true;
                } else {
                    tadiSpasi = false;
                }
            }                             
        }
        char hurufpertama = kalimat.charAt(0);
        System.out.println("Disingkat sebagai " + hurufpertama + singkatan);
    }
}
