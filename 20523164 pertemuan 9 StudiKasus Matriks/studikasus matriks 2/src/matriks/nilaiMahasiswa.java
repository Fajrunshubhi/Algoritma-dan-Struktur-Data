/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;
import java.util.Scanner;

/**
 *
 * @author fajru
 */
public class nilaiMahasiswa {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan orde matriks");
    
        System.out.print("Jumlah Baris : ");
        int Baris = input.nextInt();
        System.out.print("Jumlah Kolom : ");
        int kolom = input.nextInt();
        
        char[][] array = new char[Baris][kolom];
        
        
        for (int i = 0; i < Baris; i++) {
            int totalBaris = i+1;
            for (int j = 0; j < kolom; j++) {                
                int totalKolom = j+1;
                System.out.print("Masukan jawaban (huruf) mahasiswa ke " + totalBaris + " untuk pertanyaan ke "+ totalKolom +" : ");
                array[i][j] = input.next().charAt(0);
            }            
        }
        System.out.println();
        
        
        char[] arrayJawaban = new char[Baris] ;
        for (int i = 0; i < arrayJawaban.length; i++){
            int totaljawab = i+1;
            System.out.print("Masukan Jawaban pertanyaan ke " + totaljawab + " : ");
            arrayJawaban[i] = input.next().charAt(0);
        }      
            
        
        System.out.println("Jawaban Mahasiswa:");
        for (int i = 0; i < Baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();             
        }   
        System.out.println();
        
        System.out.println("Kunci Jawaban");
        for (int i = 0; i < arrayJawaban.length; i++) {
                System.out.print(arrayJawaban[i] + " ");
        }           
        
        System.out.println();
        
        for (int i = 0; i < Baris; i++){
            int benar = 0;
            int totalBaris = i + 1;
            System.out.print("Mahasiswa ke-"+ totalBaris +" memiliki jawaban benar sebanyak ");
            for (int j = 0; j < kolom; j++){
                if (arrayJawaban[j] == array[i][j]){
                    benar = benar +1;
                }
            }
            System.out.println(benar);
         }              
    }
}
