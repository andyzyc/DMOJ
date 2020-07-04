package ccc;

import java.util.Scanner;

public class ccc13j3s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt() + 1;
        while (true) {
            String str = Integer.toString(num);
            if (str.length() == 1) {
                break;
            }

            if (str.length() == 2) {
                if (str.charAt(0) != str.charAt(1)) {
                    break;
                }
            }

            if (str.length() == 3) {
                if (str.charAt(0) != str.charAt(1) && str.charAt(0) != str.charAt(2) && str.charAt(1) != str.charAt(2)) {
                    break;
                }
            }

            if (str.length() == 4) {
                if (str.charAt(0) != str.charAt(1) && str.charAt(0) != str.charAt(2) && str.charAt(0) != str.charAt(3) && str.charAt(1) != str.charAt(2) && str.charAt(1) != str.charAt(3) && str.charAt(2) != str.charAt(3)) {
                    break;
                }
            }
            if (str.length() == 5) {
                if (str.charAt(0) != str.charAt(1) && str.charAt(0) != str.charAt(2) && str.charAt(0) != str.charAt(3) && str.charAt(0) != str.charAt(4) && str.charAt(1) != str.charAt(2) && str.charAt(1) != str.charAt(3) && str.charAt(1) != str.charAt(4) && str.charAt(2) != str.charAt(3) && str.charAt(2) != str.charAt(4) && str.charAt(3) != str.charAt(4)) {
                    break;
                }
            }

            num = Integer.parseInt(str);
            num++;
        }
        System.out.println(num);
    }
}
