package ccc;

import java.util.Scanner;

public class ccc02j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        
        if (num == 0) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println();
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
        }
        if (num == 5) {
            System.out.println(" * * *");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
        }
        if (num == 9) {
            System.out.println(" * * *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println("*     *");
            System.out.println(" * * *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println("      *");
            System.out.println(" * * *");
        }
    }
}
