package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibonacci {

    public static int[] memo = new int[1000000000];

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());

        System.out.println(fib(N) % 1000000007);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
}
