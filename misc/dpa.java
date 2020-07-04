package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dpa {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] stoneHeight = new int[N];
        for (int i = 0; i < N; i++) {
            stoneHeight[i] = Integer.parseInt(st.nextToken());
        }

        int[] shortestToN = new int[N];
        shortestToN[1] = Math.abs(stoneHeight[1] - stoneHeight[0]);
        for (int i = 2; i < N; i++) {
            shortestToN[i] = Math.min(shortestToN[i-2] + Math.abs(stoneHeight[i] - stoneHeight[i-2]),
                    shortestToN[i-1] + Math.abs(stoneHeight[i] - stoneHeight[i-1]));
        }

        System.out.println(shortestToN[N-1]);
    }
}
