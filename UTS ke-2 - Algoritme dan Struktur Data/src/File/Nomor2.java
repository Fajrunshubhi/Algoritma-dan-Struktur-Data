package File;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
*/

public class Nomor2 {
    
    public static void main(String[] args) {
        
        String alfabet = "HIJKLMNXYZ";
        
        // program untuk menampilkan banyak karakter
        int panjang = alfabet.length();
        System.out.println("Banyak karakter pada String alfabet adalah: " + panjang);
        
        // Menampilkan karakter pada indeks ke 7
        System.out.println("karakter pada index ke-7 adalah: " + alfabet.charAt(7));
        
        // Menampilkan indeks dari karakter Y
        System.out.println("karakter Y ada pada index ke-: " + alfabet.indexOf("Y"));       
    }
}
