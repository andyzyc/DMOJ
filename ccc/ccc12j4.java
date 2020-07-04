package ccc;

import java.util.Scanner;

public class ccc12j4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int S = 3*(i+1)+K;
            letter -= 64;
            if (letter - S <= 0) {
                letter -= S;
                letter += 26;
            } else {
                letter -= S;
            }
            letter += 64;
            System.out.print(letter);
        }
    }
}
