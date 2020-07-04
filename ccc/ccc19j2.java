package ccc;

import java.util.Scanner;

public class ccc19j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        for (int i = 0; i < L; i++) {
            int num = s.nextInt();
            String sym = s.nextLine();
            String[] arr = sym.split(" ");
            for (int j = 0; j < num; j++) {
                System.out.print(arr[1]);
            }
            System.out.println();
        }
    }
}
