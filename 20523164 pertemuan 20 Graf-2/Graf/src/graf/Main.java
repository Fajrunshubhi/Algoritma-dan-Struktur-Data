package graf;

/**
 *
 * @author fajrun shubhi
 */

public class Main {
    public static void main(String[] args) {
        
        Graph mygraph = new Graph(6);
        mygraph.addEdge(0, 1);
        mygraph.addEdge(1, 2);
        mygraph.addEdge(4, 0);
        mygraph.addEdge(4, 2);
        mygraph.addEdge(4, 3);
        mygraph.addEdge(0, 3);
        mygraph.addEdge(5, 3);
        System.out.println("jarak 2 ke 5 = "+ mygraph.getDist(2, 5));
        mygraph.draw();

    }
}
