package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dmopc19c3p2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String[] str = st.nextToken().split("");

        long[] factorial = new long[16];
        for (int i = 0; i <= 15; i++) {
            factorial[i] += fac(i);
        }

        int[] letter = new int[27];
        for (int i = 0; i < N; i++) {
            if (!(str[i].charAt(0) == '*')) {
                letter[str[i].charAt(0) - 96]++;
            }
        }

        Arrays.sort(letter);
        long denom = 1;
        for (int i = 26; i > 0; i--) {
            if (letter[i] >= 0) {
                denom *= factorial[letter[i]];
            } else {
                break;
            }
        }

        if (K == 0) {
            System.out.println(factorial[N] / denom);
        }

        else if (K == 1) {
            long total = 0;
            for (int i = 26; i > 0; i--) {
                if (letter[i] >= 0) {
                    total += factorial[N] / (denom * (letter[i]+1));
                } else {
                    break;
                }
            }
            System.out.println(total);
        }

        else if (K == 2) {
            long total = 0;
            for (int i = 26; i > 0; i--) {
                if (letter[i] >= 0) {
                    for (int j = i; j > 0; j--) {
                        if (letter[i] >= 0) {
                            if (i == j) {
                                total += factorial[N] / (denom * (letter[i]+2) * (letter[i]+1));
                            } else {
                                total += factorial[N] / (denom * (letter[i]+1) * (letter[j]+1));
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            System.out.println(total);
        }
    }

    public static long fac(int i) {
        if (i <= 1) {
            return 1;
        }
        return fac(i-1) * i;
    }
}
