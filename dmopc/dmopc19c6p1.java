package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc19c6p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        double fx1 = Integer.parseInt(st.nextToken());
        double fy1 = Integer.parseInt(st.nextToken());
        double fx2 = Integer.parseInt(st.nextToken());
        double fy2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double sx1 = Integer.parseInt(st.nextToken());
        double sy1 = Integer.parseInt(st.nextToken());
        double sx2 = Integer.parseInt(st.nextToken());
        double sy2 = Integer.parseInt(st.nextToken());

        double m1 = 0;
        double m2 = 0;
        if (fx2 - fx1 == 0) {
            m1 = 1e9;
        } else if (fy2 - fy1 != 0) {
            m1 = (fy2 - fy1) / (fx2 - fx1);
        }
        if (sx2 - sx1 == 0) {
            m2 = 1e9;
        } else if (sy2 - sy1 != 0) {
            m2 = (sy2 - sy1) / (sx2 - sx1);
        }
        double b1 = 0;
        if (m1 != 1e9) {
            b1 = fy2 - (fx2 * m1);
        }
        double b2 = sy2 - (sx2 * m2);

        if (m1 == m2 && b1 == b2) {
            System.out.println("coincident");
        } else if (m1 == m2) {
            System.out.println("parallel");
        } else {
            double finx = -1e9;
            double finy = -1e9;
            if (m1 == 0) {
                finy = b1;
            } else if (m2 == 0) {
                finy = b2;
            }
            if (m1 == 1e9) {
                finx = b1;
            } else if (m2 == 1e9) {
                finx = b2;
            }
            if (finx == -1e9) {
                finx = (b2 - b1) / (m1 - m2);
            }
            double temp = 0;
            if (finy == -1e9) {
                finy = (finx * m2) + b2;
                temp = (finx * m1) + b1;
            }
            if (finy != temp) {
                finy = Math.max(finy, temp);
            }
            System.out.println(finx + " " + finy);
        }
    }
}
