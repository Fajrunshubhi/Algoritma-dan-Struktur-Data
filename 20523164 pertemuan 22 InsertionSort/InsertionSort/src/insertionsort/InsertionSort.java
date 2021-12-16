package insertionsort;


public class InsertionSort {
    
    public void insort(int array[]){
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            while ((j >= 0) && (array[j] > key)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int data[] = {5,1,4,6,2,3};
        InsertionSort in = new InsertionSort();
        
        System.out.println("Array awal: ");
        for(int i:data){    
            System.out.print(i+" ");    
        }
        System.out.println("");
        
        in.insort(data);
        
        System.out.println("Array setelah diurutkan: ");
        for(int i:data){    
            System.out.print(i+" ");    
        }
        System.out.println("");
    }
}
