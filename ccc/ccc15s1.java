package ccc;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc15s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int total = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < a; i++) {
            int z = s.nextInt();
            if (z != 0) {
                arrList.add(z);
            } else {
                arrList.remove(arrList.size() - 1);
            }
        }
        
        for (int j = 0; j < arrList.size(); j++) {
            total += arrList.get(j);
        }
        System.out.println(total);
    }
}
