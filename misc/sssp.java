package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class sssp {

    // Pair class, holds edgeToNode and weight
    public static class Pair implements Comparable<Pair> {

        public int edgeToNode;
        public int weight;

        public Pair(int edgeToNode, int weight) {
            this.edgeToNode = edgeToNode;
            this.weight = weight;
        }

        public void setEdgeToNode(int edgeToNode) {
            this.edgeToNode = edgeToNode;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getEdgeToNode() {
            return edgeToNode;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "edgeToNode=" + edgeToNode +
                    ", weight=" + weight +
                    '}';
        }

        public int compareTo(Pair o) {
            return this.edgeToNode - o.edgeToNode;
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // initializing empty adjacency list / array of arraylists
        ArrayList<Pair>[] vertices = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            vertices[i] = new ArrayList<Pair>();
        }

        // filling adjacency list / array of arraylists
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            vertices[u].add(new Pair(v, w));
            vertices[v].add(new Pair(u, w));
        }

        // maintains distance
        int[] distances = new int[N+1];

        // track processed nodes
        boolean[] processed = new boolean[N+1];

        // priority queue, initializing all distances to infinity
        PriorityQueue<Pair> q = new PriorityQueue<Pair>();
        for (int i = 2; i <= N; i++) {
            distances[i] = (int) 1e9;
        }

        // dijkstra's
        q.add(new Pair(0, 1));
        while (!q.isEmpty()) {

            // remove item from queue
            int a = q.poll().getWeight();

            // check if previously processed
            if (processed[a]) {
                continue;
            }

            // set to processed
            processed[a] = true;

            // updating shortest paths
            for (Pair b : vertices[a]) {
                if (distances[a]+b.getWeight() < distances[b.getEdgeToNode()]) {
                    distances[b.getEdgeToNode()] = distances[a]+b.getWeight();
                    q.add(new Pair(distances[b.getEdgeToNode()], b.getEdgeToNode()));
                }
            }
        }

        // print minimum distance to node i or -1 if cannot reach
        for (int i = 1; i <= N; i++) {
            int temp = distances[i];
            if (temp == (int) 1e9) {
                System.out.println(-1);
            } else {
                System.out.println(temp);
            }
        }

    }

}
