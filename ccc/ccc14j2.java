package ccc;

import java.util.Scanner;

public class ccc14j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numVotes = Integer.parseInt(s.nextLine());
        String votes = s.nextLine();
        
        int numA = 0;
        int numB = 0;
        
        // iterate through string and check characters
        for (int i = 0; i < numVotes; i++) {
            if (votes.charAt(i) == 'A') {
                numA++;
            } else {
                numB++;
            }
        }
        
        // find winner
        if (numA > numB) {
            System.out.println('A');
        } else if (numA < numB) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
    }
}
