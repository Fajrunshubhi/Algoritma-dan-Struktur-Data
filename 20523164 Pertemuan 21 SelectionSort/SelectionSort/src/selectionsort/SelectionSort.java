package selectionsort;

/**
 *
 * @author fajrun shubhi
 */

public class SelectionSort {
    
    public void Sort (int[] array){
        //iterasi
        for (int i = 0; i < array.length-1; i++){
            //proses pencarian indeks nilai terkecil
            int indexMin = i;
            for (int j = (i+1); j < array.length; j++){
                if(array[j] < array[indexMin]){
                    indexMin = j;
                }
            }
            
            //nilai terkecil ke-i
            int nilaiMin = array[indexMin];
            
            if(i != indexMin){
                //proses pertukaran posisi
                //nilai terkecil ke-i menempati indeks ke-i
                array[indexMin] = array[i];
                array[i] = nilaiMin;
            }
        }
    }  

    public static void main(String[] args) {
        
        int[] data = {9,14,3,2,43,11,58,22};
        SelectionSort s = new SelectionSort();
        
        System.out.println("Array awal:");
        for(int i: data){
            System.out.print(i+" ");
        }
        System.out.println("");
        
        s.Sort(data);
        
        System.out.println("\nArray setelah diurutkan:");
        for(int i:data){
            System.out.print(i+" ");        
        }
        System.out.println("");
    }
    
}
