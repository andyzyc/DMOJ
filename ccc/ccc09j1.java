package ccc;

import java.util.Scanner;

public class ccc09j1 {
    public static void main(String[] args) {
        int defaultValue = 91;
        int[] input = new int[3];
        Scanner s = new Scanner(System.in);
        input[0] = s.nextInt();
        input[1] = s.nextInt();
        input[2] = s.nextInt();
        int total = defaultValue + input[0] + input[1]*3 + input[2];
        System.out.println("The 1-3-sum is " + total);
    }
}
