package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dmopc19c5p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = M;
        ArrayList<String> items = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            items.add(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            boolean flag = true;
            for (int j = 0; j < T; j++) {
                st = new StringTokenizer(br.readLine());
                if (!items.contains(st.nextToken())) {
                    flag = false;
                }
            }
            if (!flag) {
                answer--;
            }
        }
        System.out.println(answer);
    }
}
