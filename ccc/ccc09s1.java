package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc09s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int counter = 0;

        for (int i = 0; i <= Math.cbrt(Math.sqrt(b)); i++) {
            if (Math.pow(i, 6) >= a && Math.pow(i, 6) <= b) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
