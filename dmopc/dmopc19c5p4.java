package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class dmopc19c5p4 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] money = new int[N+1];
        int[] bully = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            money[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            bully[i] = Integer.parseInt(st.nextToken());
        }
        int[] memo = new int[N+1];
        for (int i = 1; i <= N; i++) {
            memo[i] = f(i, money, bully, memo, 0);
        }

        outerloop:
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (p < c) {
                for (int j = 1; j <= N; j++) {
                    if (p + memo[j] >= c) {
                        System.out.println(j);
                        continue outerloop;
                    }
                }
            }
            System.out.println(-1);
        }
    }
    public static int f(int i, int[] money, int[] bully, int[] memo, int total) {
        if (memo[i] != 0) {
            return memo[i] + total;
        } else {
            total += money[i];
        }
        if (bully[i] == 0) {
            return total;
        } else {
            return f(bully[i], money, bully, memo, total);
        }
    }
}
