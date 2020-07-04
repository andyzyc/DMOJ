package ecoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ecoo17r2p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // initializing variables
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String[] rules = new String[4];
            String[] ans = new String[4];

            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                rules[j] = st.nextToken();
                ans[j] = st.nextToken();
            }

            st = new StringTokenizer(br.readLine());
            String bottomLayout = st.nextToken();
            String topLayout = "";

            for (int j = 1; j < M; j++) {
                if (j == 1) {
                    topLayout = nextLevel(N, bottomLayout, rules, ans);
                } else {
                    topLayout = nextLevel(N, topLayout, rules, ans);
                }
            }

            System.out.println(topLayout);

            st = new StringTokenizer(br.readLine());
            String endAsterisk = st.nextToken();
        }
    }
    public static String nextLevel(int N, String currLayout, String[] rules, String[] ans) {
        StringBuilder nextLayout = new StringBuilder();
        for (int i = 0; i < N; i ++) {
            String panel = "";
            panel += currLayout.charAt((i+N-1)%N);
            panel += currLayout.charAt((i+1)%N);
            if (panel.equals(rules[0])) {
                nextLayout.append(ans[0]);
            } else if (panel.equals(rules[1])) {
                nextLayout.append(ans[1]);
            } else if (panel.equals(rules[2])) {
                nextLayout.append(ans[2]);
            } else if (panel.equals(rules[3])) {
                nextLayout.append(ans[3]);
            }
        }
        return nextLayout.toString();
    }
}
