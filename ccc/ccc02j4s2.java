package ccc;

import java.util.Scanner;
import java.lang.Math;

public class ccc02j4s2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int whole = (int) Math.floor(a/b);
        int mod = a%b;
        if (a%2 == 0 && b%2 == 0) {
            mod = mod/2;
            b = b/2;
        } if (a%3 == 0 && b%3 == 0) {
            mod = mod/3;
            b = b/3;
        }
        if (a == 0) {
            System.out.println(0);
        } else if (whole == 0 && mod != 0) {
            System.out.println(mod + "/" + b);
        } else if (mod == 0 && whole != 0) {
            System.out.println(whole);
        } else {
            System.out.println(whole + " " + mod + "/" + b);
        }
    }
}
