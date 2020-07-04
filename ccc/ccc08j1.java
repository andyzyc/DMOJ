package ccc;

import java.util.Scanner;

public class ccc08j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double weight = s.nextDouble();
        double height = s.nextDouble();
        
        if ((weight / (height * height)) < 18.5) {
            System.out.println("Underweight");
        } else if ((weight / (height * height)) > 25) {
            System.out.println("Overweight");
        } else {
            System.out.println("Normal weight");
        }
    }
}
