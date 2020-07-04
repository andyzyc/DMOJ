package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc14c2p4 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());

        // mass of individual trees
        int[] massTrees = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            massTrees[i] = Integer.parseInt(st.nextToken());
        }

        // prefix sum array
        int[] totalMassTrees = new int[N+1];
        totalMassTrees[1] = massTrees[0];
        for (int i = 1; i < N; i++) {
            totalMassTrees[i+1] = totalMassTrees[i] + massTrees[i];
        }

        // query
        st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int totalMass = totalMassTrees[b+1] - totalMassTrees[a];
            System.out.println(totalMass);
        }
    }
}
