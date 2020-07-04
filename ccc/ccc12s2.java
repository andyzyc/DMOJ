package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc12s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String[] aromatic = st.nextToken().split("");
        int total = Integer.parseInt(aromatic[aromatic.length-2]) * convert(aromatic[aromatic.length-1]);
        for (int i = aromatic.length-1; i >= 2; i-=2) {
            if (convert(aromatic[i]) > convert(aromatic[i-2])) {
                total -= Integer.parseInt(aromatic[i-3]) * convert(aromatic[i-2]);
            } else {
                total += Integer.parseInt(aromatic[i-3]) * convert(aromatic[i-2]);
            }
        }
        System.out.println(total);
    }
    public static int convert(String roman) {
        switch (roman) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return -1;
        }
    }
}
