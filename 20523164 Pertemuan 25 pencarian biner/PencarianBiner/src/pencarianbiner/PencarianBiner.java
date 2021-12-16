package pencarianbiner;

import java.util.Scanner;

public class PencarianBiner {
    
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kumpulan data Array: ");
        boolean ketemu = false;
        int[] array = {12,31,42,45,57,75,80,82,87};
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\nMasukan angka yang ingin dicari = ");
        int x = input.nextInt();
        
        int kanan = array.length-1;
        int kiri = 0;
        int posisi;
        
        while (!ketemu && kiri <= kanan){
            
            int tengah = (kanan + kiri)/2;
            if(array[tengah] == x){
                ketemu = true;
                System.out.println("Angka "+x+" ditemukan" );
            }

            else{
                if(x < array[tengah]){
                    kanan = tengah - 1;
                }
                if(x > array[tengah])
                    kiri = tengah + 1;
            }
            
            if (ketemu){
                posisi = tengah+1;
                System.out.println("ditemukan pada posisi ke- " + posisi);
            }
            else{
                posisi = 0;
            }
        }
    }
}
