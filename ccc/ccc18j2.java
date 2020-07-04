package ccc;

import java.util.Scanner;

public class ccc18j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        String parkday1 = s.nextLine();
        String parkday2 = s.nextLine();
        int occupied = 0;
        
        for (int i = 0; i < N; i++) {
            if ((parkday1.charAt(i) == 'C') && (parkday2.charAt(i)) == 'C') {
                occupied++;
            }
        }
        System.out.println(occupied);
    }
}
