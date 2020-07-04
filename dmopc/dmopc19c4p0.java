package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc19c4p0 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String[] A = st.nextToken().split("");
        st = new StringTokenizer(br.readLine());
        String[] B = st.nextToken().split("");
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!A[i].equals(B[i])) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("LARRY IS SAVED!");
        } else {
            System.out.println("LARRY IS DEAD!");
        }
    }
}
