package kasuspencarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fajrun shubhi
 */

public class pencarianData {
    
    
    List<barangToko> listBarang = new ArrayList<barangToko>();
    
    public void cariData(List<barangToko> listBarang){
        Scanner bacaInput = new Scanner(System.in);
        Scanner bacaLagi = new Scanner(System.in);
        
        boolean lagi = true;
        while (lagi){
            System.out.print("Masukkan id pelanggan yang dicari: ");
            int X = bacaInput.nextInt();
            System.out.println("===================================");
        
            // pencarian sekuensial
            boolean ketemu = false;
            int i = 0;
            int banyak = listBarang.size();
            int posisi = 0;

            while (!(ketemu) && (i<banyak)) {
                if (listBarang.get(i).getId() == X){
                    ketemu = true;
                    posisi = i;
                } 
                else {
                    i = i + 1;
                }
            }
        
            // buat tampilkan data kalau X ditemukan
            if (ketemu) {
                System.out.println("Data pembelian dengan id = " + X);
                System.out.println("Nama Pembeli: "+listBarang.get(posisi).getNamaPelanggan());
                System.out.println("Id produk: "+listBarang.get(posisi).getIdProduk());
                System.out.println("Nama produk: "+listBarang.get(posisi).getNamaProduk());
                System.out.println("Banyak pembelian: "+listBarang.get(posisi).getBanyak());
            } 
            else {
                // buat tampilkan pesan kalau tidak ditemukan
                System.out.println("Maaf, pembelian dengan id = " + X + " tidak ditemukan");
            }
            System.out.println();
            System.out.print("Mau mencari lagi(y/t)? ");
            String pilihanLagi = bacaLagi.next();

            System.out.println();          
            System.out.println("===================================");          

            if (pilihanLagi.compareTo("t") == 0){
                lagi=false;
            }
        }
    }
}
