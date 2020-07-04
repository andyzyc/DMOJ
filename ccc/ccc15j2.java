package ccc;

import java.util.Scanner;

public class ccc15j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int numHappy = 0;
        int numSad = 0;
        int fromIndex = 0;
        String happy = ":-)";
        String sad = ":-(";
        
        while ((fromIndex = str.indexOf(happy, fromIndex)) != -1) {
            numHappy++;
            fromIndex++;
        }
        while ((fromIndex = str.indexOf(sad, fromIndex)) != -1) {
            numSad++;
            fromIndex++;
        }
        
        if (numHappy < numSad) {
            System.out.println("sad");
        } else if (numHappy > numSad) {
            System.out.println("happy");
        } else if (numHappy == numSad && numHappy != 0) {
            System.out.println("unsure");
        } else {
            System.out.println("none");
        }
    }
}
