package kasuspencarian;


/**
 *
 * @author fajrun shubhi
 */

public class barangToko {
    private int id;
    private String namaPelanggan;
    private String idProduk;
    private String namaProduk;
    private int banyak;

    public void setId(int x){
        this.id = x;           
    }
    public void setNamaPelanggan(String x){
        this.namaPelanggan = x;           
    }

    public void setIdProduk(String x){
        this.idProduk = x;           
    }

    public void setNamaProduk(String x){
        this.namaProduk = x;           
    }

    public void setBanyak(int x){
        this.banyak = x;           
    }

    public int getId(){
        return this.id;
    }

    public String getNamaPelanggan(){
        return this.namaPelanggan;
    }

    public String getIdProduk(){
        return this.idProduk;
    }

    public String getNamaProduk(){
        return this.namaProduk;
    }

    public int getBanyak(){
        return this.banyak;
    }
}
