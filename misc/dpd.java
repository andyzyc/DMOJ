package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//INCOMPLETE
public class dpd {

    public static class Pair implements Comparable<Pair> {
        public int weight;
        public int value;

        // constructor
        public Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        // compareTo method
        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
        }

        // weight getter method
        public int getWeight() {
            return weight;
        }

        // value getter method
        public int getValue() {
            return value;
        }

        // toString method
        @Override
        public String toString() {
            return "Pair{" +
                    "weight=" + weight +
                    ", value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        ArrayList<Pair> items = new ArrayList<Pair>();
        items.add(new Pair(0, 0));
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            items.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(items);
        System.out.println(items);
        System.out.println(items.get(3).getValue());
        System.out.println(items.indexOf(items.get(3)));
        System.out.println(f(N, W, items));
    }

    public static int f(int N, int W, ArrayList<Pair> items) {
        if (W <= 0) {
            return (int) -1e9;
        } else if (N <= 0) {
            return 0;
        } else if (items.get(N).getWeight() > W) {
            return f(N-1, W, items);
        } else {
            return Math.max(f(N-1, W, items), f(N-1, W-items.get(N).getWeight(), items) + items.get(N).getValue());
        }
    }

}
