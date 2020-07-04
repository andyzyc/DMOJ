package ccc;

import java.util.Scanner;

public class ccc11j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int antenna = s.nextInt();
        int eye = s.nextInt();
        
        if ((antenna >= 3) && (eye <= 4)) {
            System.out.println("TroyMartian");
        }
        if ((antenna <= 6) && (eye >= 2)) {
            System.out.println("VladSaturnian");
        }
        if ((antenna <= 2) && (eye <= 3)) {
            System.out.println("GraemeMercurian");
        }
    }
}
