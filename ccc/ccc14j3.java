package ccc;

import java.util.Scanner;

public class ccc14j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numRolls = s.nextInt();
        s.nextLine();
        int playerTotalA = 100;
        int playerTotalB = 100;
        
        for (int i = 0; i < numRolls; i++) {
            String[] rolls = s.nextLine().split(" ");
            int playerA = Integer.parseInt(rolls[0]);
            int playerB = Integer.parseInt(rolls[1]);
            
            if (playerA < playerB) {
                playerTotalA -= playerB;
            } else if (playerA > playerB) {
                playerTotalB -= playerA;
            }
        }
        System.out.println(playerTotalA);
        System.out.println(playerTotalB);
    }
}
