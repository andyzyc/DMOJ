package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class vpex1p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int[] first = new int[5];
        int[] second = new int[5];

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                st = new StringTokenizer(br.readLine());
            }
            if (i < 5) {
                first[i] = Integer.parseInt(st.nextToken());
            } else {
                second[i%5] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(first);
        Arrays.sort(second);
        int firstTotal = 0;
        int secondTotal = 0;

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                firstTotal += first[i];
            } else {
                secondTotal += second[i%5];
            }
        }

        firstTotal -= first[0];
        secondTotal -= second[0];

        if (firstTotal > secondTotal) {
            System.out.println(firstTotal);
        } else {
            System.out.println(secondTotal);
        }
    }
}
