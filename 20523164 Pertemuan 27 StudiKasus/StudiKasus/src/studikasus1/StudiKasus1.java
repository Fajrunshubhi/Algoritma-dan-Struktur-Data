package studikasus1;

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

public class StudiKasus1 {
    
    
    public static void main(String[] args) {
        
        BufferedReader br;
        String line;
        List<data> listBarang = new ArrayList<data>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama file (txt) : ");
        String namaF = sc.nextLine();
        
        try {
            br=new BufferedReader(new FileReader(namaF));
            while((line = br.readLine())!=null){
                
                String[] barangArray = line.split(" ");
                
                data barang = new data();
              
                barang.setAwal(Character.toString(barangArray[0].charAt(0)));
                barang.setIzinBaca(Character.toString(barangArray[0].charAt(7)));
                barang.setBulan(barangArray[5]);
                barang.setTgl(Integer.parseInt(barangArray[6]));
                barang.setNamaFile(barangArray[8]);
                
                listBarang.add(barang);
            }
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.print("Query : ");
        String waktu = sc.nextLine();
        
        String tanggal[] = waktu.split(" ");      
        for (int i = 0; i < listBarang.size(); i++) {
            if (listBarang.get(i).getAwal().equals("-")){
                if(listBarang.get(i).getIzinBaca().equals("r")){
                    if(listBarang.get(i).getBulan().equals(tanggal[0])){
                        if(listBarang.get(i).getTgl() <= Integer.parseInt(tanggal[1])){
                            System.out.println(listBarang.get(i).getNamaFile());
                        }
                    }
                }
            }
        }
    }
    
}
