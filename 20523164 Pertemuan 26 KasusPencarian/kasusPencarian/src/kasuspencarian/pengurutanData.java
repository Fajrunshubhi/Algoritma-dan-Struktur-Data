package kasuspencarian;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fajrun shubhi
 */

public class pengurutanData {
    
    List<barangToko> listBarang=new ArrayList<barangToko>();
    
    public void pengurutan(List<barangToko> listBarang){
       
        QuickSort sort = new QuickSort();
        
        int[] banyak = new int[listBarang.size()];
        
        for(int i=0; i<listBarang.size(); i++){
            banyak[i] = listBarang.get(i).getId();   
        }
        
        sort.quickSort(banyak, 0, listBarang.size()-1);
        
        boolean n = false;
        int[] pilih = new int[listBarang.size()] ;
        
        try{
            for(int i =0; i< listBarang.size();i++){
                int j =0;
                while ((j<listBarang.size())) {
                    if (listBarang.get(j).getId() == banyak[i]){

                        pilih[j] = j;
                        System.out.println(
                                "Id: "+listBarang.get(pilih[j]).getId()+" "+
                                "Nama Pelanggan: "+listBarang.get(pilih[j]).getNamaPelanggan()+" "+
                                "Id Produk: "+listBarang.get(pilih[j]).getIdProduk()+" "+
                                "Nama Produk: "+listBarang.get(pilih[j]).getNamaProduk()+" "+
                                "Banyak: "+listBarang.get(pilih[j]).getBanyak());   

                    i = i+1;
                    } 
                    else {
                        j = j + 1;
                    }
                }
            }
        }
        catch(Exception e){       
            System.out.println(e.getMessage());
        }    
    }
}
