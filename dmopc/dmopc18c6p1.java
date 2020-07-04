package dmopc;

import java.util.Scanner;

public class dmopc18c6p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        int neither = 0;
        int both = 0;
        int DNA = 0;
        int RNA = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'C' || str.charAt(i) == 'G') {
                both++;
            } else if (str.charAt(i) == 'T') {
                DNA++;
            } else if (str.charAt(i) == 'U') {
                RNA++;
            } else {
                neither++;
            }
        }
        if (neither != 0) {
            System.out.println("neither");
        } else if (DNA == 0 && RNA != 0) {
            System.out.println("RNA");
        } else if (RNA == 0 && DNA != 0) {
            System.out.println("DNA");
        } else if (DNA != 0 && RNA != 0) {
            System.out.println("neither");
        } else {
            System.out.println("both");
        }
    }
}
