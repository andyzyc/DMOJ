package ccc;

import java.util.Scanner;

public class ccc12j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        
        for (int i = 0; i < k; i++) {
            for (int a = 0; a < k; a++) {
                System.out.print("*");
            }
            for (int b = 0; b < k; b++) {
                System.out.print("x");
            }
            for (int c = 0; c < k; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int a = 0; a < k; a++) {
                System.out.print(" ");
            }
            for (int b = 0; b < k; b++) {
                System.out.print("x");
            }
            for (int c = 0; c < k; c++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int a = 0; a < k; a++) {
                System.out.print("*");
            }
            for (int b = 0; b < k; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < k; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
