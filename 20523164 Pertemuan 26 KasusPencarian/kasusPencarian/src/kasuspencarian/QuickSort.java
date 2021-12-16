package kasuspencarian;

/**
 *
 * @author fajrun shubhi
 */

public class QuickSort {
     public void quickSort(int[] arr, int low, int high){
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
}
