package graf;

import java.util.ArrayList;

/**
 *
 * @author fajrun shubhi
 */

public class Graph {
    
    
    private ArrayList<ArrayList<Edge>> adj = new ArrayList< ArrayList<Edge> >();
    
    public Graph(int N) {
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<Edge>());
        }
    }
    
    // method utama addEdge
    public void addEdge(int source, int dest, int weight, boolean directed){
        ArrayList<Edge> adjU = (ArrayList<Edge>) adj.get(source);
        adjU.add(new Edge(dest, weight));
        if(directed==false){
            ArrayList<Edge> adjV = (ArrayList<Edge>) adj.get(dest);
            adjV.add(new Edge(source, weight));
        }
    }

    // untuk unweighted directed graph
    public void addEdge(int u, int v, boolean directed){ 
        this.addEdge(u, v, 1, directed);
    }
    
    // untuk unweighted graph
    public void addEdge(int u, int v){ 
        this.addEdge(u, v, 1, false);
    }
    
    public void draw(){
        for(int i=0;i<adj.size();i++){
            System.out.print(i+" : ");
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(i);
            for(int j=0;j<adjacent.size();j++){
                Edge v = (Edge) adjacent.get(j);
                System.out.print("("+v.dest+", "+v.weight+") ");
            }
            System.out.println("");
        }
    }
}

