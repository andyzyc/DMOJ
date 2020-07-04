package ccc;

import java.util.Scanner;

public class ccc18j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();
        
        if ((num1 == 8 || num1 == 9) && (num4 == 8 || num4 == 9) && (num2 == num3)) {
            System.out.println("ignore");
        } else System.out.println("answer");
    }
}
