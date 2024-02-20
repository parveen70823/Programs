import java.net.SocketTimeoutException;
import java.util.*;
public class graph {
    static class Edge{
        int src;
        int dst;
        int wt;
            public Edge(int s, int d, int w){
                this.src=s;
                this.dst=d;
                this.wt=w;
            }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V]; //intitally it is empty means no matlab from this we have to create aray of a empty arraylist
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        // 0 k neighbours
        graph[0].add(new Edge(0,1,5));

        // 1 k neigh.
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 k neighbour
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3 k neighbour
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 k nieghbour
        graph[4].add(new Edge(4,2,2));

        // task is to print the neighbours of the 2's
        for(int i=0; i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println(e.dst);
        }



    }
}
