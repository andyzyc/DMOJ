package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class wac3p3v2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String S = st.nextToken();
        int total = S.length();
        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        String[] C = new String[M];
        int[] P = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            C[i] = st.nextToken();
            P[i] = Integer.parseInt(st.nextToken());
        }

        // iterate string
        int i = 0;
        while (i < S.length()) {
            // iterate combos
            for (int j = 0; j < M; j++) {
                int length = C[j].length();
                if (length+i > S.length()) {
                    if (j+1 == M) {
                        i++;
                    }
                    continue;
                }
                String substring = S.substring(i, length+i);
                if (substring.equals(C[j])) {
                    total += P[j];
                    i += C[j].length();
                    break;
                }
                if (j+1 == M) {
                    i++;
                }
            }
        }
        System.out.println(total);
    }
}
