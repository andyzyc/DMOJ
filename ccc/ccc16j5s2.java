package ccc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class ccc16j5s2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> dmoj = new ArrayList<Integer>();
        ArrayList<Integer> peg = new ArrayList<Integer>();
        int Q = s.nextInt();
        int N = s.nextInt();
        int total = 0;
        
        for (int i = 0; i < N*2; i++) {
            if (i < N) {
                dmoj.add(s.nextInt());
            } else if (i >= N) {
                peg.add(s.nextInt());
            }
        }
        
        Collections.sort(dmoj);
        Collections.sort(peg);
        if (Q == 2) {
            Collections.reverse(peg);
        }
        
        for (int j = 0; j < N; j++) {
            total += Math.max(dmoj.get(j), peg.get(j));
        }
        
        System.out.println(total);
    }
}
