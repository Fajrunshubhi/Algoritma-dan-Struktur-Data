package percobaan.string;

public class PercobaanString {
    
    public static void main(String[] args) {
        
        String kataKata = "20523164 Fajrun Shubhi";
        // Isilah kataKata dengan NIM dan nama lengkap Anda
        
   
        char hasil_charAt;
        int hasil_length;
        String hasil_substring_1;
        String hasil_substring_2;
        boolean hasil_contains;
        String hasil_join;
        
        System.out.println("Yang format dicoba sendiri yaa!");


        
        hasil_charAt = kataKata.charAt(5);
        hasil_length = kataKata.length();
        hasil_substring_1 = kataKata.substring(5);
        hasil_substring_2 = kataKata.substring(5, 10);
        hasil_contains = kataKata.contains("Fajrun");
        hasil_join = String.join(kataKata, " dan ", " tambahan ");
        
        System.out.println("Yang format dicoba sendiri yaa!");


    }
    
}
