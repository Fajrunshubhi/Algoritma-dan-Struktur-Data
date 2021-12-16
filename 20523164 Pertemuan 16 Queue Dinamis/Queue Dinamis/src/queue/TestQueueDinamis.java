package queue;

/**
 *
 * @author fajrun shubhi
 */

public class TestQueueDinamis {
    public static void main(String[] args) {
        Queue<String> mhs = new Queue<>();
        
        mhs.add("Agus");
        mhs.add("Sinta");
        mhs.add("Bambang");
        
        System.out.println("Elemen pertama: "+mhs.peek());
        
        mhs.remove();
        System.out.println("Elemen pertama: "+mhs.peek());
        
        mhs.tampil();
        
        mhs.clear();
        System.out.println("Elemen pertama: "+mhs.peek());
        
    }
}
