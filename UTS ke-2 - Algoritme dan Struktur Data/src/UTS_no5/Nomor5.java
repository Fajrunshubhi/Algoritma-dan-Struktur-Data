package UTS_no5;

/**
 *
 * @author fajrun shubhi
 * NAMA: FAJRUN SHUBHI
 * NIM: 20523164
 * 
*/

public class Nomor5 {
    public static void main(String[] args) {
        
        double IPK = 0;
        
        double jumSKS = 0;
        double jumnilai = 0;
        LinkedList nilais = new LinkedList<>();
        nilais.add(new HitungIpk("ASD", 5, "A"));
        nilais.add(new HitungIpk("RPL", 6, "A-"));
        nilais.add(new HitungIpk("FPA", 6, "B+"));
        nilais.add(new HitungIpk("PBA", 6, "A"));
        nilais.add(new HitungIpk("SCPK", 3, "C"));

        LinkedList.Element n = nilais.first;

        System.out.println("Matakuliah diambil:");
        while (n != null) {
            HitungIpk nilai = (HitungIpk) n.data;
            System.out.println(nilai.toString());
            jumnilai += nilai.nilai1;
            jumSKS += nilai.sks;

            n = n.next;
        }
        System.out.println("IPK: " + jumnilai / jumSKS);
    }
}
