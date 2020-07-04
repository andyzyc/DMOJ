package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc05s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int currX = 0;
        int currY = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0) {
                System.exit(0);
            }

            if (x + currX >= c) {
                System.out.print(c);
                currX = c;
            } else if (x + currX <= 0) {
                System.out.print(0);
                currX = 0;
            } else {
                System.out.print(x + currX);
                currX += x;
            }

            System.out.print(" ");

            if (y + currY >= r) {
                System.out.print(r);
                currY = r;
            } else if (y + currY <= 0) {
                System.out.print(0);
                currY = 0;
            } else {
                System.out.print(y + currY);
                currY += y;
            }

            System.out.println();
        }
    }
}
