package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dpb {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] stoneHeight = new int[N];
        for (int i = 0; i < N; i++) {
            stoneHeight[i] = Integer.parseInt(st.nextToken());
        }

        int whenKOne = 0;
        if (K == 1) {
            for (int i = 1; i < N; i++) {
                whenKOne += Math.abs(stoneHeight[i] - stoneHeight[i-1]);
            }
            System.out.println(whenKOne);
            System.exit(0);
        }

        int[] shortestToN = new int[N];
        for (int i = 2; i < N; i++) {
            shortestToN[i] = (int) 1e9;
        }
        shortestToN[1] = Math.abs(stoneHeight[1] - stoneHeight[0]);

        for (int i = 2; i < N; i++) {
            for (int j = 1; j < K; j++) {
                if (i-j-1 >= 0) {
                    int temp = Math.min(shortestToN[i-j-1] + Math.abs(stoneHeight[i] - stoneHeight[i-j-1]),
                            shortestToN[i-j] + Math.abs(stoneHeight[i] - stoneHeight[i-j]));
                    if (shortestToN[i] > temp) {
                        shortestToN[i] = temp;
                    }
                }
            }
        }

        System.out.println(shortestToN[N-1]);
    }
}
