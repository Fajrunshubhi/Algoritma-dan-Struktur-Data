/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

/**
 *
 * @author fajru
 */
public class Matriks1 {
    public static void main(String[] args) {
        
        //membuat matriks pertama
        int a[][] = {{1,2},{3,4}};
        
        //membuat matriks kedua
        int b[][] = {{5,6},{7,8}};
        
        //tampung penjumlahan matriks
        int c[][] = new int[2][2];
        
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }            
    }
    
}
