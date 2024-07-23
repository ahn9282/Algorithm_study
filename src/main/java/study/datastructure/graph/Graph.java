package study.datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("C", "B");
        myGraph.addEdge("C", "D");
        myGraph.addEdge("B", "D");
        myGraph.printGraph();

       // myGraph.removeEdge("A", "B");
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }

    private Map<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean removeVertex(String vertex){
        if (adjList.get(vertex) != null) {
        ArrayList<String> arr = adjList.get(vertex);
        for (String s : arr) {
            adjList.get(s).remove(vertex);
        }
            adjList.remove(vertex);
        return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    public boolean addEdge(String vertex1, String vertex2) {
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean addVertex(String vertex) {
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
    public void printGraph(){
        System.out.println(adjList);

    }

    public Map<String, ArrayList<String>> getAdjList() {
        return adjList;
    }
}
