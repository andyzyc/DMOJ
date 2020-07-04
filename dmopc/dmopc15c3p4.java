package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//INCOMPLETE
public class dmopc15c3p4 {

    // pair class
    public static class Pair implements Comparable<Pair> {

        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public int compareTo(Pair o) {
            return this.x - o.x;
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        Pair[] cities = new Pair[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            cities[i] = new Pair(x, y);
        }
        int[] distances = new int[N];
        boolean[] processed = new boolean[N];
        PriorityQueue<Pair> q = new PriorityQueue<Pair>();
        for (int i = 0; i < N; i++) {
            distances[i] = (int) 1e9;
        }

        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        distances[X] = 0;
        q.add(cities[X]);
        while (!q.isEmpty()) {
            int x = q.peek().getX();
            int y = q.poll().getY();
            
        }
    }
}
