package ccc;

import java.util.Scanner;

public class ccc14j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angle1 = s.nextInt();
        int angle2 = s.nextInt();
        int angle3 = s.nextInt();
        int angleAll = angle1 + angle2 + angle3;
        
        if (angleAll == 180) {
            if (angle1 == angle2 && angle1 == angle3) {
                System.out.println("Equilateral");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
