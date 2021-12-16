package graf;

/**
 *
 * @author fajrun shubhi
 */

public class Main {
    public static void main(String[] args) {
        
        Graph mygraph = new Graph(5);
        mygraph.addEdge(0, 1);
        mygraph.addEdge(1, 2);
        mygraph.addEdge(3, 4, 12, false);
        mygraph.addEdge(0, 4, true);
        mygraph.draw();
    } 
}
