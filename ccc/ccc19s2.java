package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc19s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //initializing sieve of eratosthenes
        boolean[] prime = new boolean[1002001];
        for (int i = 2; i*i <= 1002000; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= 1002000; j += i) {
                    prime[j] = true;
                }
            }
        }

        // initializing variables
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int counter = 1;
            if (N % 2 == 1) {
                counter = 2;
            }
            while (true) {
                if (!prime[N - counter] && !prime[N + counter]) {
                    System.out.println((N-counter) + " " + (N+counter));
                    break;
                } else {
                    counter += 2;
                }
            }
        }
    }
}
