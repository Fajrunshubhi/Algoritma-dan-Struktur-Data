/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudikasuspertemuan28;

import java.util.Scanner;

/**
 *
 * @author fajrun shubhi
 */

public class SudiKasusPertemuan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;
        int harga = 0;
        int jumlahBeli;
        int total;
        int totalAll = 0;
        int bayar;
        int kembalian;
        int diskon;
        String beliLagi;
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("========== Warung Pajrun ==========");
        System.out.println("=========== Daftar Menu ===========");
        System.out.println("1.   | Nasi Goreng    |   Rp.12000 ");
        System.out.println("2.   | Kwetiaw Goreng |   Rp.15000 ");
        System.out.println("3.   | Bihun          |   Rp.10000 ");
        System.out.println("4.   | Mie Goreng     |   Rp.20000 ");
        System.out.println("5.   | Es Teh         |   Rp.5000 ");
        System.out.println("6.   | Aneka Jus      |   Rp.10000 ");
        
        
        Boolean lagi = true;
        while (lagi){
            System.out.print("\nSilahkan pilih menu yang anda pesan : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    harga = 12000;
                    System.out.println("Nasi Goreng, harga Rp." + harga);
                    System.out.println("Untuk Nasi Goreng kami ada diskon sebesar 50%");
                    diskon = (harga*50/100);
                    harga = harga - diskon;
                    System.out.println("Harga : " + harga);
                    break;
                case 2:
                    harga = 15000;
                    System.out.println("Kwetiaw Goreng, harga Rp." + harga);
                    break;
                case 3:
                    harga = 10000;
                    System.out.println("Bihun, harga Rp." + harga);
                    break;
                case 4:
                    harga = 20000;
                    System.out.println("Mie Goreng, harga Rp." + harga);
                    System.out.println("Untuk Mie Goreng kami ada diskon sebesar 75%");
                    diskon = (harga*75/100);
                    harga = harga - diskon;
                    System.out.println("Harga : " + harga);
                    break;
                case 5:
                    harga = 5000;
                    System.out.println("Es Teh, harga Rp." + harga);
                    break;
                case 6:
                    harga = 10000;
                    System.out.println("Aneka Jus, harga Rp." + harga);
                    System.out.println("Untuk Aneka Jus kami ada diskon sebesar 25%");
                    diskon = (harga*25/100);
                    harga = harga - diskon;
                    System.out.println("Harga : " + harga);
                    break;
                default:
                    System.out.println("Maaf Pilihan yang Anda Pilih Salah !");
                    break;
            }
            
            System.out.print("Jumlah Porsi : ");
            jumlahBeli = input.nextInt();
            total = harga * jumlahBeli; 
            totalAll = totalAll + total;
            
            System.out.print("\nApakah ingin menambah pesanan?(y/t): ");
            String pilihanLagi = input.next();

            System.out.println("\n==========================================");

            if (pilihanLagi.equals("t")) {
                lagi = false;
            }
            else {
                lagi = true;
            }
           
        }
        
        System.out.println("Total yang harus anda bayar adalah: " + totalAll);
        System.out.println("================================================");
        System.out.print("Masukan jumlah uang yang anda bayar : ");
        bayar = input.nextInt();
        if (bayar < totalAll){
            System.out.println("Uang bayar kurang, pembelian gagal, silahkan pesan lagi!!!");
        }
        else{
            kembalian = bayar - totalAll;       
            System.out.println("Uang kembalian anda sebesar : " + kembalian);
            System.out.println("========================================================");
            System.out.println("===== Terima Kasih telah berbelanja di warung kami =====");
        }
    }
    
}
