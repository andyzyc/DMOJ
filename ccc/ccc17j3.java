package ccc;

import java.util.Scanner;

public class ccc17j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
        int req = s.nextInt();
        int diff1 = Math.max(arr[0], arr[2]) - Math.min(arr[0], arr[2]);
        int diff2 = Math.max(arr[1], arr[3]) - Math.min(arr[1], arr[3]);
        int length = diff1 + diff2;
        if (req < length) {
            System.out.println("N");
        } else if (req == length) {
            System.out.println("Y");
        } else {
            if ((length - req) % 2 == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
