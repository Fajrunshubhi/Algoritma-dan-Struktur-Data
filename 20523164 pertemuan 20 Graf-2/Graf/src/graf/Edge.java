package graf;

/**
 *
 * @author fajrun shubhi
 */

public class Edge {
    
    int dest, weight;
    
    public Edge(int dest, int weight){
        this.dest = dest;
        this.weight = weight;
    }
    
    public int getDest(){
      return this.dest;
    }

    public int getWeight(){
      return this.weight;
    }

    
}
