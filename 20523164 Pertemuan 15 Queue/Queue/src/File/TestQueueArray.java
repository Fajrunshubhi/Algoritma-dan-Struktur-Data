package File;

/**
 *
 * @author fajrun shubhi
 */

public class TestQueueArray {
    
    public static void main(String[] args) {
        
        QueueArray q = new QueueArray(10);
        
        System.out.println("Queue kosong? "+q.isEmpty()+"\n");
        
        int i;
        Integer j;
        
        for(i = 0; i < 10; i++){
            j = (int)(Math.random()*100);
            q.enqueue(j);
        }
        
        System.out.println("\nQueue penuh? "+q.isFull());
        
        q.enqueue(200);
        System.out.println(q.jumlahElement());
        
        System.out.println("\nHapus --> "+q.dequeue());
        System.out.println("Hapus --> "+q.dequeue());
        System.out.println("Hapus --> "+q.dequeue());
        
        System.out.println(q.jumlahElement());
    }
}
