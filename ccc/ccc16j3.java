package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc16j3 {

    public static int currentPalindromeSize = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String input = st.nextToken();
        int maxPalindromeSize = 1;

        for (int i = 0; i < input.length()-1; i++) {
            for (int j = input.length()-1; j > 0; j--) {
                currentPalindromeSize = 0;
                if (recursion(input, i, j)) { // check in recursion function
                    if (maxPalindromeSize < currentPalindromeSize) {
                        maxPalindromeSize = currentPalindromeSize;
                    }
                }
            }
        }

        System.out.println(maxPalindromeSize);

    }

    public static boolean recursion(String input, int i, int j) {
        if (input.charAt(i) == input.charAt(j)) {
            currentPalindromeSize+=2;
            if (i == j) {
                currentPalindromeSize--;
                return true;
            } else if (i+1 == j) {
                return true;
            } else if (i > j) {
                return false;
            } else {
                return recursion(input, i+1, j-1);
            }
        }
        return false;
    }

}
