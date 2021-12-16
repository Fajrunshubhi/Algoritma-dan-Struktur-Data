package queue;

/**
 *
 * @author fajrun shubhi
 */

public class Queue<E> extends LinkedList {
       
    public Queue(){
        
    }
    
    public Object peek(){
        return getFirst();
    }
}
