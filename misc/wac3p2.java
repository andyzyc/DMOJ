package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wac3p2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int D = Integer.parseInt(st.nextToken());
        for (int i = 0; i < D; i++) {
            st = new StringTokenizer(br.readLine());
            long H = Integer.parseInt(st.nextToken());
            long base = (long) Math.floor(H/3);

            if (H % 3 == 0) {
                System.out.println(base * base * base);
            } else if (H % 3 == 1) {
                System.out.println(base * base * (base+1));
            } else if (H % 3 == 2) {
                System.out.println(base * (base+1) * (base+1));
            }

        }

    }
}
