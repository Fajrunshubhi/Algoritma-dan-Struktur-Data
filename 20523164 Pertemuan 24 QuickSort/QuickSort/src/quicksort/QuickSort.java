package quicksort;


public class QuickSort {

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = arr[(low+high)/2];
            
            int i = low, j = high;
            while (i <= j) {
                while (arr[i] < pivot) i++;
                while (arr[j] > pivot) j--;
                
                if (i <= j) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }
            quickSort(arr, low, j);
            quickSort(arr, i, high);
        }
    }
    
    
    static void bubbleSort(int array[]) {
        int n = 1;
        int ukuran = array.length;
        //iterasi
        while(n < ukuran){
            //proses pengecekan
            for (int i = 0; i < (ukuran-1); i++){
                if (array[i] > array[i+1]){
                //proses pertukaran posisi elemen
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                }
            }            
            n++;
        }
    }

    
    
    public static void main(String[] args) {
        
        int[] arr = new int[50000];
        
        for(int i=0;i<50000;i++){
            arr[i]=50000-i;
        }
        
        long startTime = System.currentTimeMillis();
        
        System.out.println("MULAI SORTING");
        bubbleSort(arr);
        System.out.println("SELESAI SORTING");

        long stopTime = System.currentTimeMillis();
        long duration = stopTime - startTime;
        System.out.println("Waktu eksekusi algoritme: " + duration + " ms");
        
        
        


        
        
//        int[] arr = {9, 6, 3, 1, 7, 8, 2, 5, 4};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
//
//        quickSort(arr, 0, arr.length-1);
//        
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
    }
    
}
