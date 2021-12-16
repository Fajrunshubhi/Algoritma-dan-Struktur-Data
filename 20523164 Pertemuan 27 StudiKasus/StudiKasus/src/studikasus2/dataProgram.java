package studikasus2;

/**
 *
 * @author fajrun shubhi
 */

public class dataProgram {
    String nama;
    int memory;
    int urutan;

    public dataProgram(String nama, int memory, int urutan) {
        this.nama = nama;
        this.memory = memory;
        this.urutan = urutan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }
}
