package kasuspencarian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fajrun shubhi
 */

public class namaFile {
    
    List<barangToko> listBarang = new ArrayList<barangToko>();
    
    public void cariFile (){
        BufferedReader br;
        String line;
        Scanner bacaNamaF = new Scanner(System.in);
        System.out.print("Masukkan nama file barang (csv) = ");
        String namaF = bacaNamaF.next();
        try {
            br = new BufferedReader(new FileReader(namaF));
            while((line = br.readLine())!= null){
                
                String[] barangArray = line.split(";");
                
                barangToko barang = new barangToko();
              
                barang.setId(Integer.parseInt(barangArray[0]));
                barang.setNamaPelanggan(barangArray[1]);
                barang.setIdProduk(barangArray[2]);
                barang.setNamaProduk(barangArray[3]);
                barang.setBanyak(Integer.parseInt(barangArray[4]));
                
                listBarang.add(barang);
                
            }
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
