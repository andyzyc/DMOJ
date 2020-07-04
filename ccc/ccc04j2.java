package ccc;

import java.util.Scanner;

public class ccc04j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int Y = s.nextInt();
        
        while (X <= Y) {
            System.out.println("All positions change in year " + X);
            X += 60;
        }
    }
}
