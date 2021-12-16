package graf;

import java.util.ArrayList;

/**
 *
 * @author fajrun shubhi
 */

public class Graph {
    
    
    private ArrayList<ArrayList<Edge>> adj = new ArrayList< ArrayList<Edge> >();
    QueueArray queue = new QueueArray(100);
    private boolean[] visited;
    private int[] distance;
    
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
    
    public void clearVisit(){    
        visited = new boolean [adj.size()];
        distance = new int [adj.size()];
        for(int i = 0; i < adj.size(); i++){
            visited[i]=false;
            distance[i]=1000000000;

        }
    }

    public void dfs(int nodeIdx){
        visited[nodeIdx] = true;
        ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeIdx);
        for(int i=0;i<adjacent.size();i++){
            int dest = ((Edge) adjacent.get(i)).getDest();
            if(visited[dest]==false){
                dfs(dest);
            }
        }
    }
    
    
    public int countCC(){
        clearVisit();
        int counter = 0;
        for(int i=0;i<adj.size();i++){
            if(visited[i]==false){
                counter++;
                dfs(i);
            }
        }
        return counter;
    }
    
    
    public void bfs(int nodeIdx){
        queue.clear();
        queue.enqueue(nodeIdx);
        while(queue.isEmpty() == false){
            int nodeNow = (int) queue.dequeue();
            visited[nodeNow] = true;       
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeNow);
            for(int i=0;i<adjacent.size();i++){
                int dest = ((Edge) adjacent.get(i)).getDest();
                if(visited[dest]==false){
                    queue.enqueue(dest);    
                }
            }
        }
    }
    
    
    public int getDist(int start, int finish){
        clearVisit(); 
        distance[start] = 0; 
        queue.clear();
        queue.enqueue(start);
        while(queue.isEmpty() == false){
            int nodeNow = (int) queue.dequeue();
            visited[nodeNow] = true;
            if(nodeNow==finish)
                return distance[nodeNow];
            ArrayList<Edge> adjacent = (ArrayList<Edge>) adj.get(nodeNow);
            for(int i=0;i<adjacent.size();i++){
                int dest = ((Edge) adjacent.get(i)).getDest();
                if(visited[dest]==false){
                    distance[dest] = Math.min(distance[dest], distance[nodeNow]+1);
                    queue.enqueue(dest);    
                }
            }
        }
        return -1;
    }
    
}

