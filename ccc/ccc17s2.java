package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc17s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int[] tides = new int[N];
        float halfway = N/2;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tides[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tides);

        if (N % 2 == 1) {
            halfway++;
        }

        for (int i = 0; i < halfway; i++) {
            System.out.print(tides[(int) (halfway-1-i)] + " ");
            if (N % 2 == 1 && i == N/2) {
                break;
            }
            System.out.print(tides[(int) (halfway+i)] + " ");
        }
    }
}
