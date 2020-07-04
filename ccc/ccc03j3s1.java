package ccc;

import java.util.Scanner;

public class ccc03j3s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int position = 1;
        while (position != 100 && s.hasNext()) {
            int move = s.nextInt();
            if (move == 0) {
                System.out.println("You Quit!");
                break;
            }
            if (position + move < 101) {
                position += move;
            }
            if (position == 54) {
                position = 19;
            } else if (position == 90) {
                position = 48;
            } else if (position == 99) {
                position = 77;
            } else if (position == 9) {
                position = 34;
            } else if (position == 40) {
                position = 64;
            } else if (position == 67) {
                position = 86;
            }
            System.out.println("You are now on square " + position);
        }
        if (position == 100) {
            System.out.println("You Win!");
        }
    }
}
