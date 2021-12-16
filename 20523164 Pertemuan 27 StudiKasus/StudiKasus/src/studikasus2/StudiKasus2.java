package studikasus2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fajrun shubhi
 */

public class StudiKasus2 {
    
    public static void QuickSort(dataProgram[] arr, int low, int high){
        if(low < high){
            int pivot = arr[(low+high)/2].getMemory();
            
            int i = low, j = high;
            while(i <= j){
                while(arr[i].getMemory() > pivot) i++;
                while(arr[j].getMemory() < pivot) j--;
                
                if(i <= j){
                    dataProgram tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    
                    i++;
                    j--;
                }
            }
            QuickSort(arr, low, j);
            QuickSort(arr, i, high);
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Random random = new Random();
                
        System.out.print("Banyak Program: ");
        int banyakProgram = input.nextInt();
        dataProgram[] program = new dataProgram[banyakProgram];
        dataProgram[] tmp = new dataProgram[banyakProgram];
        int urutan = 0;
        
        for(int i = 0; i < banyakProgram; i++){
            urutan = urutan+1;
            program[i] = new dataProgram("Program"+(char) (random.nextInt(26)+'A'), random.nextInt(70)+1, urutan);
            tmp[i] = program[i];
        }
        
        QuickSort(program, 0, program.length-1);       
        for(dataProgram barang : program){
            System.out.println(barang.getNama()+" "+barang.getMemory()+" "+barang.getUrutan());
        }
        
        System.out.print("Maksimal Memory: ");
        int kapasitasMemory = input.nextInt();
        System.out.println();
        
        int MemoriFull = 0;
        for(dataProgram barang : tmp){
            MemoriFull = MemoriFull + barang.getMemory();
        }
        
        if(MemoriFull > kapasitasMemory){
            for(int i = 0; i < tmp.length; i++){
                MemoriFull = MemoriFull - tmp[i].getMemory();
                if(MemoriFull <= kapasitasMemory){
                    break;
                }
            }
        }
        
        System.out.println("Total Memori saat ini: "+MemoriFull);
        
    }
    
    
}
