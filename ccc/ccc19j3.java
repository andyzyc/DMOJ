package ccc;

import java.util.Scanner;

public class ccc19j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N + 1; i++) {
            String str = s.nextLine();
            str += " ";
            int counter = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == str.charAt(j + 1)) {
                    counter++;
                } else {
                    counter++;
                    System.out.print(counter + " " + str.charAt(j) + " ");
                    counter = 0;
                }
            }
            System.out.println();
        }
    }
}
