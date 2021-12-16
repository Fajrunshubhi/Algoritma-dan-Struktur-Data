package matriks;
import java.util.Scanner;


public class ganjilGenap {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan orde matriks");
    
        System.out.print("Jumlah Baris : ");
        int Baris = input.nextInt();
        System.out.print("Jumlah Kolom : ");
        int kolom = input.nextInt();
        
        int[][] array = new int[Baris][kolom];
        
        for (int i = 0; i < Baris; i++) {
            int totalBaris = i+1;
            for (int j = 0; j < kolom; j++) {                
                int totalKolom = j+1;
                System.out.print("Masukan elemen matriks beris ke " + totalBaris + " kolom ke "+ totalKolom +" : ");
                array[i][j] = input.nextInt();
            }
        }        
        System.out.println("Isian matriks:");
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();             
        }   
        
        int bilanganGanjil = 0;
        int bilanganGenap = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                            
                if (array[i][j] % 2 == 1){                  
                    bilanganGanjil += 1;
                }
                else if (array [i][j] % 2 == 0){
                    bilanganGenap += 1;
                }
            }           
        }
        System.out.println("Banyak bilangan ganjil di dalam matriks adalah: " + bilanganGanjil );
        System.out.println("Banyak bilangan genap di dalam matriks adalah: " + bilanganGenap );
    }
}
