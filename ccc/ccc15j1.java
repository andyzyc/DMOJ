package ccc;

import java.util.Scanner;

public class ccc15j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        int day = s.nextInt();
        
        if (month < 2) {
            System.out.println("Before");
        } else if (month > 2) {
            System.out.println("After");
        } else if (day < 18) {
            System.out.println("Before");
        } else if (day > 18) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }
    }
}
