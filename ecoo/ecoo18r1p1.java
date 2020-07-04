package ecoo;

import java.util.Scanner;

public class ecoo18r1p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int T = s.nextInt();
            int N = s.nextInt();
            int total = 0;
            s.nextLine();
            for (int j = 0; j < N; j++) {
                String letter = s.nextLine();
                if (letter.equals("E")) {
                    //nothing happens
                } else if (letter.equals("B")) {
                    total += T;
                }
                if (total > 0) {
                    total--;
                }
            }
            System.out.println(total);
        }
    }
}
