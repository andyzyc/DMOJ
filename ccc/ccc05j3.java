package ccc;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc05j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> dir = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; s.hasNext(); i++) {
            dir.add(s.nextLine());
            str.add(s.nextLine());
        }
        for (int i = dir.size() - 1; i > 0; i--) {
            String dirCur = dir.get(i);
            String strCur = str.get(i - 1);
            if (dirCur.equals("R")) {
                dirCur = "LEFT";
                System.out.println("Turn " + dirCur + " onto " + strCur + " street.");
            } else if (dirCur.equals("L")) {
                dirCur = "RIGHT";
                System.out.println("Turn " + dirCur + " onto " + strCur + " street.");
            }
        }
        if (dir.get(0).equals("R")) {
            String dirCur = "LEFT";
            System.out.println("Turn " + dirCur + " into your HOME.");
        } else if (dir.get(0).equals("L")) {
            String dirCur = "RIGHT";
            System.out.println("Turn " + dirCur + " into your HOME.");
        }
    }
}
