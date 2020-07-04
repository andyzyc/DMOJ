package ccc;

import java.util.Scanner;

public class ccc11s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int T = 0;
        int S = 0;
        s.nextLine();
        for (int i = 0; i < N; i++) {
            String str = s.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 't' || str.charAt(j) == 'T') {
                    T++;
                } else if (str.charAt(j) == 's' || str.charAt(j) == 'S') {
                    S++;
                }
            }
        }
        if (T > S) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }
    }
}
