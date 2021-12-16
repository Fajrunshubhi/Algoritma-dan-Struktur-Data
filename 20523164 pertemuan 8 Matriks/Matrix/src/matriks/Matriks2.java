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
public class Matriks2 {
    public static void main(String[] args){
        
        //membuat matriks pertama
        int a[][] = {{1,2},{3,4}};
        
        //membuat matriks kedua
        int b[][] = {{5,6},{7,8}};
        
        //membuat matriks ketiga
        int c[][] = {{1,2,3},{4,5,6}};
        
        int d[][] = new int[2][3];
        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < c[0].length; j++){
                int total = 0; 
                for (int k = 0; k < a.length; k++){
                    total = total +  (a[i][k] * c[k][j]);
                }
                d[i][j] = total;
            }       
        }          
        for (int i = 0; i < d.length; i++){
            for (int j = 0; j < d[0].length; j++){
                System.out.print( d[i][j] + " ");
            }       
            System.out.println();
        }
    }
    
}
