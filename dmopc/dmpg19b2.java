package dmopc;

import java.util.Scanner;

public class dmpg19b2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        if ((A > B && A > D && C > B && C > D) || (B > A && B > C && D > A && D > C)) {
            System.out.println("trans");
        } else {
            System.out.println("cis");
        }
    }
}
