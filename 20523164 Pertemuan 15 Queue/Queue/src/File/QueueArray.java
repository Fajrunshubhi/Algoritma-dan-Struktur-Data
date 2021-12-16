package File;

/**
 *
 * @author fajrun shubhi
 */

public class QueueArray {
    private Object [] queueAr;
    private int head;
    private int tail;
    private int maxsize;
    int total;


    public QueueArray(int size) {
        maxsize = size;
	queueAr = new Object[maxsize];
	head = -1;
	tail = -1;
    }
    
    public boolean isFull(){
        return tail == queueAr.length - 1;
    }
    
    public boolean isEmpty(){
	   return tail == -1;
    }
    
    public void enqueue(Object x){
        if (isEmpty()) {
            head = 0;
            tail = 0;
            queueAr[tail] = x;
            System.out.println("Inserted " + x);
	  }else if (!isFull()) {
            tail++;
            queueAr[tail] = x;
            System.out.println("Inserted " + x);
	  }else{
            System.out.println("Queue is full");
       }
    }
    
    public Object dequeue() {
        Object temp;
        if(!isEmpty()) {
            temp = queueAr[head];
            for (int i=head; i<tail; i++) {
                queueAr[i] = queueAr[i+1];
            }
            tail--;
            return temp;
        }else { 
            System.out.println("Queue is empty");
            return null;
        }
    }
        
    public void clear(){ 
        head = tail = -1;
        System.out.println ("Data Clear");
    }   
    
    public int jumlahElement () {
        System.out.print("Jumlah element pada Queue adalah: ");
        return tail + 1;
    }
}
