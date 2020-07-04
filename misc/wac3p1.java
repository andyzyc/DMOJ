package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class wac3p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int counter = 0;

        if (T < -40) {
            counter++;
        }
        if (D >= 15) {
            counter++;
        }
        if (P > 50) {
            counter++;
        }

        if (counter >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
