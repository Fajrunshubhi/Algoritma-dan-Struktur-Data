package Stack;
import java.util.Scanner;

public class notasiPostfix {
    
    public static void main (String [] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        String cekOperator;
        String cekOperator1;
        String cekOperator2;
        double jumlahHitung;
        double x;
        double y;
        
        System.out.print("Evaluasi notasi postfix ");
        String postfix = input.nextLine();
        
        StackArray<Double> stack = new StackArray<>();
        
        for(int i=0; i<postfix.length(); i++){
            cekOperator = String.valueOf(postfix.charAt(i));
            
            if(stack.isOperator(cekOperator)){
                y = (double) stack.pop();
                x = (double) stack.pop();
                System.out.println(x + " " + y + " " + cekOperator);
                jumlahHitung = stack.operation(x, y, cekOperator);
                stack.push(jumlahHitung);
                System.out.println(jumlahHitung);
            }
            else{
                double angka;
                angka = Double.parseDouble(cekOperator);
                stack.push(angka);
            }
        }        
        System.out.println("Hasil Akhir adalah: " + stack.pop());
        
        for(int i=0; i<postfix.length(); i++){
            cekOperator1 = String.valueOf(postfix.charAt(i));
            if(stack.isOperator(cekOperator1)){
                for(int j=(i+1); j<postfix.length(); j++){
                    cekOperator2 = String.valueOf(postfix.charAt(j));
                    if (!stack.isOperator(cekOperator2)) {
                        System.out.println("Postfix Invalid");
                        System.exit(0);
                    }
                }
            }             
        }   
    }             
}
