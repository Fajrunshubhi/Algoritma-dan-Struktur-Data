package Linked.List;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        
        mhs.add(new Mahasiswa("16523001","Idris",3.88));
        mhs.add(new Mahasiswa("16523002","Agus",3.18));
        mhs.add(new Mahasiswa("16523003","Dani",3.42));
        mhs.add(new Mahasiswa("16523008","Roni",3.67));
        mhs.add(new Mahasiswa("16523020","Sinta",3.05));
        
        
        
        LinkedList.Element ptr = mhs.first;
        
        while(ptr != null) {
            Mahasiswa m = (Mahasiswa) ptr.data;
            System.out.println("NIM: "+m.getNIM());
            System.out.println("Nama: "+m.getNama());
            System.out.println("IPK: "+m.getIPK());
            System.out.println("");
            ptr = ptr.next;    
        }
        

        
        // MENGUBAH DATA NIM PADA INDEX KE 3 
        System.out.println();
        LinkedList.Element ubah = mhs.first;
        for (int i=0; i<mhs.size(); i++){
            Mahasiswa mh = (Mahasiswa) ubah.data;
            if (i == 3){
                System.out.println("Berikut adalah hasil dari mengganti data NIM, NAMA, IPK pada index ke-3: ");
                mh.setIPK(3.9);
                mh.setNIM("20523164");
                mh.setNama("Fajrun Shubhi");
                
                System.out.println("NIM: "+mh.getNIM());
                System.out.println("Nama: "+mh.getNama());
                System.out.println("IPK: "+mh.getIPK());
                System.out.println("");
                ubah = ubah.next; 
            }                            
                 
        }
        
    }       
             
}
