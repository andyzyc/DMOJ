package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc13s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int W = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] bridge = new int[4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            bridge[i%4] = Integer.parseInt(st.nextToken());
            if (bridge[0] + bridge[1] + bridge[2] + bridge[3] > W) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(N);
    }
}
