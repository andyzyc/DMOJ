package ccc;

import java.util.Scanner;

public class ccc12j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        
        for (int i = 0; i < 4; i++) {
            arr[i] = s.nextInt();
        }
        if ((arr[0] < arr[1]) && (arr[1] < arr[2]) && (arr[2] < arr[3])) {
            System.out.println("Fish Rising");
        } else if ((arr[0] > arr[1]) && (arr[1] > arr[2]) && (arr[2] > arr[3])) {
            System.out.println("Fish Diving");
        } else if ((arr[0] == arr[1]) && (arr[1] == arr[2]) && (arr[2] == arr[3])) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
