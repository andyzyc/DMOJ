package dmopc;

import java.util.Scanner;

public class dmpg19b1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int C = 0;
        for (int i = 0; i < N; i++) {
            C += s.nextInt();
        }
        if (C > 200) {
            System.out.println("Over maximum capacity!");
        } else if (C < 200) {
            System.out.println(200 - C);
        } else {
            System.out.println(0);
        }
    }
}
