package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc11j3 {
    public static int sumacLength = 2;

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int tn1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int tn2 = Integer.parseInt(st.nextToken());

        sumacSequence(tn1, tn2);
        System.out.println(sumacLength);
    }

    public static void sumacSequence(int tn1, int tn2) {
        int tn3 = tn1 - tn2;
        sumacLength++;
        if (tn3 > tn2) {
            // end
        } else {
            sumacSequence(tn2, tn3);
        }
    }
}
