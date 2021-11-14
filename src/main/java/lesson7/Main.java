package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 6);
        graph.addEdge(2, 5);
        graph.addEdge(2, 9);
        graph.addEdge(3, 5);
        graph.addEdge(4, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);

        System.out.println("Edges = " + graph.getEdgeCount());
        System.out.println("Vertices = " + graph.getVertexCount());
        System.out.println("Neighbour nodes of the specified vertex 5: " + graph.getAdjList(5));
        System.out.println();

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);
        System.out.println("Is there a path from the source 0 to the dist 9? " + bfp.hasPathTo(9));
        System.out.println("What vertices are on the way? " + bfp.pathTo(9));
        System.out.println();

    }
}
