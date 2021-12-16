package queue;

/**
 *
 * @author fajrun shubhi
 */

public class TestQueueCircular {
    public static void main(String[] args) {
        QueueCircular q = new QueueCircular(10);
        int i;
        Integer j;
        
        for(i=0;i<10;i++){
            j = (int)(Math.random()*100);
            q.enqueue(j);
        }   
        q.Display();
    }
}
