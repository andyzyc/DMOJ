package ccc;

import java.util.Scanner;

public class ccc11s2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] arr = new String[2 * n];
        int x = 0;
        
        for (char i = 0; i < 2 * n; i++) {
            arr[i] = s.nextLine();
        }
        for (char j = 0; j < n; j++) {
            String a = arr[j];
            String b = arr[j + n];
            if (b.equals(a)) {
                x++;
            }
        }
        System.out.println(x);
    }
}
