package File;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
*/

public class Nomor4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Stack<String> stak = new Stack<>();
        
        System.out.print("Masukkan nim: ");
        String nim = input .nextLine();

        System.out.println("NIM Asli adalah: ");
        System.out.println(nim);

        System.out.println("");

        for (int i = 0;i < nim.length(); i++){
            stak.push(nim.substring(i,i+1));
        }
        String a = "";
        while(!stak.isEmpty()){
            a += stak.pop();
        }

        System.out.println("NIM setelah dibalik adalah:");
        System.out.println(a);       
    }   
}
