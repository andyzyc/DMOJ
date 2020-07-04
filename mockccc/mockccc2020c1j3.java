package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mockccc2020c1j3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        long X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long Y = Integer.parseInt(st.nextToken());
        long decimal = X*Y % 4;
        String deci = ".00";
        if (decimal == 1) {
            deci = ".25";
        } else if (decimal == 2) {
            deci = ".50";
        } else if (decimal == 3) {
            deci = ".75";
        }
        System.out.println((X*Y)/4 + deci);

    }
}
