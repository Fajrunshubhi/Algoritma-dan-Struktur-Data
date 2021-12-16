package bubblesort;

public class BubbleSort {

    public void sorting(int array[]) {
        int n = 1;
        while(n < array.length){
            boolean tukar = false;
            for (int i = 0; i < (array.length - 1); i++){
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    tukar = true;
                }
            }
            if (!tukar){
                break;
            }           
            
            System.out.println("\nUrutan iterasi ke-" + n);
            for (int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println("");
            n++;     
        }
    }
       
    
    public static void main(String[] args) {
        int data[] = {35,13,26,10,39,40};
        BubbleSort b = new BubbleSort();
        
        System.out.println("Array awal: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        
        b.sorting(data);
        
        System.out.println("");
        System.out.println("Array setelah diurutkan: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");      
    }
    
}
