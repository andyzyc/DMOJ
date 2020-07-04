package ccc;

import java.util.Scanner;

public class ccc13j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String signWord = s.next();
        int numN = 0;
        
        for (int i = 0; i < signWord.length(); i++) {
            char c = signWord.charAt(i);
            if (c == 'I' || c == 'O' || c == 'S' || c == 'H' || c == 'Z' || c == 'X' || c == 'N') {
                numN++;
            }
        }
        if (numN == signWord.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
