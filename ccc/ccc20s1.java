package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ccc20s1 {
    public static class Pair implements Comparable<Pair> {
        public double time;
        public double distance;

        public Pair(int time, int distance) {
            this.time = time;
            this.distance = distance;
        }

        public double getTime() {
            return time;
        }

        public double getDistance() {
            return distance;
        }

        public int compareTo(Pair o) {
            return (int) (this.time - o.time);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Pair> arr = new ArrayList<Pair>();
        double minSpeed = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(arr);

        for (int i = 0; i < N; i++) {
            minSpeed = Math.max(minSpeed, Math.abs((arr.get(i).getDistance() - arr.get((i+1)%N).getDistance()) / (arr.get(i).getTime() - arr.get((i+1)%N).getTime())));
        }
        System.out.println(minSpeed);
    }
}
