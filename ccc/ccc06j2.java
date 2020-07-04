package ccc;

import java.util.Scanner;

public class ccc06j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        
        if (m + n < 10) {
            System.out.println("There are 0 ways to get the sum 10.");
        } else if (m + n == 10) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            if (m >= 9 && n >= 9) {
                System.out.println("There are 9 ways to get the sum 10.");
            } else if (m == n && n == 8) {
                System.out.println("There are 7 ways to get the sum 10.");
            } else if (m == n && n == 7) {
                System.out.println("There are 5 ways to get the sum 10.");
            } else if (m == n && n == 6) {
                System.out.println("There are 3 ways to get the sum 10.");
            } else if (Math.max(m, n) >= 9) {
                System.out.println("There are " + Math.min(m, n) + " ways to get the sum 10.");
            } else {
                System.out.println("There are " + (Math.min(m, n) - (9 - Math.max(m, n))) + " ways to get the sum 10.");
            }
        }
    }
}
