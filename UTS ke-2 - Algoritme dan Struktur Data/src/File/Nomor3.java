package File;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
*/

public class Nomor3 {
    
    public static double jarak(double x1, double x2, double y1, double y2){
        double hasil;
        hasil = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return hasil;
    }

    public static double jarak2Titik(double[] koordinat1, double[] koordinat2){
        double hasil;
        hasil = Math.sqrt(Math.pow((koordinat2[0] - koordinat1[0]),2) + Math.pow((koordinat2[1] - koordinat1[1]),2));
        return hasil;
    }

    public static double closest(double[] array){
        double closest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < closest)
                closest = array[i];
        }
        return closest;
    }
   
    public static void main(String[] args) {
        
        double[][] a = { { 1, 1 }, { 2, 0.5 }, { 3, 3 } };
        
        // untuk menampilkan matriks
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        double jarakTitik1_Titik2 = jarak2Titik(a[0], a[1]);
        double jarakTitik1_Titik3 = jarak2Titik(a[0], a[2]);
        double jarakTitik2_Titik3 = jarak2Titik(a[1], a[2]);
        double[] jarak = {jarakTitik1_Titik2, jarakTitik1_Titik3, jarakTitik2_Titik3};

        System.out.println("Titik1 - Titik2: " + jarakTitik1_Titik2);
        System.out.println("Titik1 - Titik3: " + jarakTitik1_Titik3);
        System.out.println("Titik2 - Titik3: "+ jarakTitik2_Titik3);

        double closestDistance = closest(jarak);
        System.out.println("Jarak titik terdekat adalah: " +closestDistance);
    }
}
