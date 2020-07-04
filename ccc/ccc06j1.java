package ccc;

import java.util.Scanner;

public class ccc06j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = Integer.parseInt(sc.nextLine());
        int s = Integer.parseInt(sc.nextLine());
        int dr = Integer.parseInt(sc.nextLine());
        int de = sc.nextInt();
        int total = 0;
        
        if (b == 1) {
            total += 461;
        } else if (b == 2) {
            total += 431;
        } else if (b == 3) {
            total += 420;
        }

        if (s == 1) {
            total += 100;
        } else if (s == 2) {
            total += 57;
        } else if (s == 3) {
            total += 70;
        }

        if (dr == 1) {
            total += 130;
        } else if (dr == 2) {
            total += 160;
        } else if (dr == 3) {
            total += 118;
        }

        if (de == 1) {
            total += 167;
        } else if (de == 2) {
            total += 266;
        } else if (de == 3) {
            total += 75;
        }

        System.out.println("Your total Calorie count is " + total + ".");
    }
}
