package ccc;

import java.util.Scanner;

public class ccc11j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int M = s.nextInt();
        for (int t = 1; t < M; t++) {
            int A = -6 * (int) Math.pow(t, 4) + h * (int) Math.pow(t, 3) + 2 * (int) Math.pow(t, 2) + t;
            if (A <= 0) {
                System.out.println("The balloon first touches ground at hour:");
                System.out.println(t);
                break;
            }
            if (t + 1 == M) {
                System.out.println("The balloon does not touch ground in the given time.");
            }
        }
    }
}
