package ccc;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc18j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        
        while (s.hasNext()) {
            arrList.add(s.nextInt());
        }
        arrList2.add(0);
        arrList2.add(arrList.get(0));
        
        for (int i = 1; i < arrList.size(); i++) {
            arrList2.add(arrList2.get(i) + arrList.get(i));
        }
        for (int i = 0; i < arrList2.size(); i++) {
            for (int j = 0; j < arrList2.size(); j++) {
                System.out.print(Math.abs(arrList2.get(j) - arrList2.get(i)) + " ");
            }
            System.out.println();
        }
    }
}
