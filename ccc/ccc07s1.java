package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc07s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String[] bd = br.readLine().split(" ");
            if (2007 - Integer.parseInt(bd[0]) > 18) {
                System.out.println("Yes");
            } else if (2007 - Integer.parseInt(bd[0]) < 18) {
                System.out.println("No");
            } else {
                if (Integer.parseInt(bd[1]) < 2) {
                    System.out.println("Yes");
                } else if (Integer.parseInt(bd[1]) > 2) {
                    System.out.println("No");
                } else {
                    if (Integer.parseInt(bd[2]) <= 27) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
