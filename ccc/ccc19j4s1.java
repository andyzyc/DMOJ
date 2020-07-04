package ccc;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc19j4s1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        int topLeft = arrList.get(0);
        int topRight = arrList.get(1);
        int bottomLeft = arrList.get(2);
        int bottomRight = arrList.get(3);
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int currentTopLeft = topLeft;
            int currenttopRight = topRight;
            int currentBottomLeft = bottomLeft;
            int currentBottomRight = bottomRight;
            if (str.charAt(i) == 'H') {
                topLeft = currentBottomLeft;
                topRight = currentBottomRight;
                bottomLeft = currentTopLeft;
                bottomRight = currenttopRight;
            } else if (str.charAt(i) == 'V') {
                topLeft = currenttopRight;
                topRight = currentTopLeft;
                bottomLeft = currentBottomRight;
                bottomRight = currentBottomLeft;
            }
            if (i + 1 == str.length()) {
                System.out.println(topLeft + " " + topRight);
                System.out.println(bottomLeft + " " + bottomRight);
            }
        }
    }
}
