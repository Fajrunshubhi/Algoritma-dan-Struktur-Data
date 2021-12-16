/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author fajru
 */
public class forEach {
    
    public static void main(String[] args) {
        
        //Deklarasi sekaligus inisialisasi larik
        String[] namaPbola = {"Ronaldo", "Messi", "Neymar", "Ibrahimovic", "Haland", "Mbappe", "Pogba", "Suarez"};
        System.out.println("Berikut nama-nama pemain bola: ");
        for (String nama: namaPbola){
            System.out.println(nama);
        }
    }
    
}
