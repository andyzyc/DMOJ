package ccc;

import java.util.Scanner;

public class ccc17j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int k = s.nextInt();
        int total = 0;
        
        for (int i = 0; i < k + 1; i++) {
            total += N * Math.pow(10, i);
        }
        System.out.println(total);
    }
}
