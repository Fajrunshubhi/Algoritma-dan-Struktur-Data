package Stack;
import java.util.Scanner;


public class DecimaltoBiner {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackArray<Integer> tempat = new StackArray<>();

        System.out.print("Masukkan bilangan dalam desimal: ");
        int angka = input .nextInt();
        boolean kondisi = true;
        int angka1 = angka;

        while(kondisi){
            int smt = 0;
            if(angka1 > 0){
                smt = angka1 % 2;
                angka1 = angka1 / 2;
                tempat.push(smt);
            }
            else{
                kondisi = false;
            }
        }

        System.out.print("Hasil konversi bilangan desimal "+angka+" ke biner adalah : ");
        boolean i = true;
        while(i){
            if(tempat.size()!=0){
                System.out.print(tempat.pop());
            }
            else{
                i = false;
            }
        }
        System.out.println();
    }
}
