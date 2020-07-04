package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc18s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        double[] villages = new double[N];
        double smallestNeighbourhood = Integer.MAX_VALUE;

        //
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            villages[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(villages);

        for (int i = 1; i < N-1; i++) {
            double currentNeighbourhood = (villages[i] - villages[i-1])/2 + (villages[i+1] - villages[i])/2;
            if (currentNeighbourhood < smallestNeighbourhood) {
                smallestNeighbourhood = currentNeighbourhood;
            }
        }

        System.out.printf("%.1f", smallestNeighbourhood);
    }
}
