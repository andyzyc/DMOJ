package ccc;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc16j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int counter = 0;
        
        while (s.hasNext()) {
            arrList.add(s.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            int a = arrList.get(i * 4) + arrList.get(i * 4 + 1) + arrList.get(i * 4 + 2) + arrList.get(i * 4 + 3);
            int b = arrList.get(i * 4 + 4) + arrList.get(i * 4 + 5) + arrList.get(i * 4 + 6) + arrList.get(i * 4 + 7);
            if (a != b) {
                counter++;
            }
        }
        for (int i = 0; i < 3; i++) {
            int a = arrList.get(i) + arrList.get(i + 4) + arrList.get(i + 8) + arrList.get(i + 12);
            int b = arrList.get(i + 1) + arrList.get(i + 5) + arrList.get(i + 9) + arrList.get(i + 13);
            if (a != b) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
    }
}
