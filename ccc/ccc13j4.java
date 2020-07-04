package ccc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ccc13j4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int C = s.nextInt();
        int totalTime = 0;
        int numChores = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for (int i = 0; i < C; i++) {
            arrList.add(s.nextInt());
        }
        
        Collections.sort(arrList);

        for (int j = 0; j < arrList.size(); j++) {
            totalTime += arrList.get(j);
            if (totalTime <= T) {
                numChores++;
            }
        }
        System.out.println(numChores);
    }
}
