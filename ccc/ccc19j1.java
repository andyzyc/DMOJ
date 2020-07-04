package ccc;

import java.util.Scanner;

public class ccc19j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalApp = (s.nextInt() * 3) + (s.nextInt() * 2) + s.nextInt();
        int totalBan = (s.nextInt() * 3) + (s.nextInt() * 2) + s.nextInt();
        if (totalApp > totalBan) {
            System.out.println("A");
        } else if (totalApp < totalBan) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
