package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc08s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] values = new int[25001];
        for (int i = 0; i < 25001; i++) {
            values[i] = i*i;
        }
        // initializing variables
        while (true) {
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                System.exit(0);
            }
            int counter = 0;
            for (int x = 0; x <= N; x++) {
                for (int y = 0; y <= N; y++) {
                    if (values[x] + values[y] <= values[N]) {
                        counter++;
                    }
                }
            }
            System.out.println(counter*4 - N*4 - 3);
            st = new StringTokenizer(br.readLine());
        }
    }
}
