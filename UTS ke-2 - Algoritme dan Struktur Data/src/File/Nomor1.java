package File;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
 */
public class Nomor1 {
    
    public static void main(String[] args) {
        
        int[] Array = {35, 10, 75, 66, 51};        
        int nilaiTerbesar = Array[0];
        
        for(int i = 0; i < Array.length; i++){
            if(nilaiTerbesar < Array[i]){
                nilaiTerbesar = Array[i];
            }
        }    
        System. out.println("nilai terbesar adalah: " + nilaiTerbesar);
    }
}
