package Linked.List;


public class Mahasiswa {
    
    String nama = null;
    String NIM = null;
    Double IPK = 0.0;
    
    public Mahasiswa(String NIM, String nama, Double ipk){
        this.NIM = NIM;
        this.nama = nama;
        this.IPK = ipk;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getNIM(){
        return this.NIM;
    }
    
    public Double getIPK(){
        return this.IPK;
    }
    
    /*
    Ganti kode ini untuk menambahkan method setNama(), setNIM() dan setIPK()
    */   
    
    public void setNama(String namaBaru){
        nama = namaBaru;
        
    }
    public void setNIM (String nimBaru){
        NIM = nimBaru;
    }
    public void setIPK (Double ipkBaru){
        IPK = ipkBaru;
    }
    
}
