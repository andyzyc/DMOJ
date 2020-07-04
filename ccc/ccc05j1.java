package ccc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ccc05j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float day = Integer.parseInt(s.nextLine());
        float even = Integer.parseInt(s.nextLine());
        float week = s.nextInt();
        float a = 0;
        float b = 0;
        
        if (day > 100) {
            a += ((day - 100) * 0.25);
        }
        a += (even * 0.15);
        a += (week * 0.20);
        
        if (day > 250) {
            b += ((day - 250) * 0.45);
        }
        b += (even * 0.35);
        b += (week * 0.25);
        
        System.out.println("Plan A costs " + (new DecimalFormat("##.##").format(a)));
        System.out.println("Plan B costs " + (new DecimalFormat("##.##").format(b)));
        
        if (a < b) {
            System.out.println("Plan A is cheapest.");
        } else if (a > b) {
            System.out.println("Plan B is cheapest.");
        } else if (a == b) {
            System.out.println("Plan A and B are the same price.");
        }
    }
}
