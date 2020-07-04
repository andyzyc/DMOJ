package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc17s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] swifts = new int[N];
        int[] semaphores = new int[N];
        int K = 0;
        int swiftsTotal = 0;
        int semaphoresTotal = 0;
        for (int i = 0; i < N; i++) {
            swifts[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            semaphores[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            swiftsTotal += swifts[i];
            semaphoresTotal += semaphores[i];
            if (swiftsTotal == semaphoresTotal) {
                K = i+1;
            }
        }
        System.out.println(K);
    }
}
