package ccc;

import java.util.Scanner;

public class ccc10j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        
        if (i == 1 || i == 9 || i == 10) {
            System.out.println(1);
        } else if (i == 2 || i == 3 || i == 7 || i == 8) {
            System.out.println(2);
        } else if (i == 4 || i == 5 || i == 6) {
            System.out.println(3);
        }
    }
}
