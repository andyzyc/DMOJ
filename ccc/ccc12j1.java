package ccc;

import java.util.Scanner;

public class ccc12j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int speedMax = s.nextInt();
        int speedCar = s.nextInt();
        int speedDif = speedCar - speedMax;
        
        if (speedMax >= speedCar) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speedDif <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (speedDif <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
