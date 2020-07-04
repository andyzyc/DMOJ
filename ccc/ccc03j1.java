package ccc;

import java.util.Scanner;

public class ccc03j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int s = Integer.parseInt(sc.nextLine());
        int h = sc.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print("*");
                for (int k = 0; k < s; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int l = 0; l < (s * 2 + 3); l++) {
            System.out.print("*");
        }
        System.out.println();
        for (int m = 0; m < h; m++) {
            for (int n = 0; n < (s + 1); n++) {
            System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
