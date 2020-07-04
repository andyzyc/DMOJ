package dmopc;

import java.util.Scanner;

public class dmpg19b3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String spam = s.nextLine();
        int K = s.nextInt();
        int S = 0;
        int counter = 0;
        for (int i = 0; i < spam.length(); i++) {
            if (spam.charAt(i) == 'S') {
                S++;
                if (S >= K) {
                    System.out.println("Spamming");
                    counter++;
                    break;
                }
            } else if (spam.charAt(i) == 'R') {
                S = 0;
            }
        }
        if (counter == 0) {
            System.out.println("All good");
        }
    }
}
