package UTS_no5;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
*/

public class HitungIpk {
    
    public String matakuliah;
    public int sks;
    public String nilai_huruf;

    public double nilai1;

    public HitungIpk(String matakuliah, int sks, String nilai_huruf) {
        this.matakuliah = matakuliah;
        this.sks = sks;
        this.nilai_huruf = nilai_huruf;
        this.nilai1 = sks * nilaiToDouble();
    }

    private double nilaiToDouble() {
        double nilai;
        switch (nilai_huruf) {
            case "A":
                nilai = 4;
                break;
            case "A-":
                nilai = 3.75;
                break;
            case "A/B":
                nilai = 3.5;
                break;
            case "B+":
                nilai = 3.25;
                break;
            case "B":
                nilai = 3;
                break;
            case "B-":
                nilai = 2.75;
                break;
            case "B/C":
                nilai = 2.5;
                break;
            case "C+":
                nilai = 2.25;
                break;
            case "C":
                nilai = 2;
                break;
            case "C-":
                nilai = 1.75;
                break;
            case "C/D":
                nilai = 1.5;
                break;
            case "D+":
                nilai = 1.25;
                break;
            case "D":
                nilai = 1;
                break;
            case "E":
            case "F":
                nilai = 0;
                break;
            default:
                nilai = 0;
                break;
        }
        return nilai;
    }

    @Override
    public String toString() {
        return matakuliah + " " + sks + " sks" +  " nilai " + nilai_huruf;
    }
    
}
