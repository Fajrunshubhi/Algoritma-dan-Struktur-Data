
package uang.kembali;
import java.util.Scanner;
public class uangKembalian {
    
    public static void main(String[] args) {

        int[] nominal={100000,50000,20000,10000,5000,2000,1000,500,200,100};
         
        Scanner input = new Scanner(System.in);
          
        System.out.print("Masukan Jumlah Uang     : ");
        int uang = input.nextInt();
          
        System.out.print("Masukan Total Belanja :  ");
        int tot = input.nextInt();
          
        int kembalian = uang-tot;
        if (kembalian == 0){
            System.out.println("Tidak ada uang kembalian");
        }
        else{
            System.out.println("Uang Kembalian terdiri: ");
            for(int i=0;i<10;i++){ 
                int jumlah = kembalian/nominal[i];
                kembalian-= jumlah*nominal[i];
              
                if(jumlah==0){  
                    
                }
                else{
                System.out.println( jumlah + " lembar uang pecahan "+ nominal[i]  );  
                }       
            }
        }
    }
}    
         
        