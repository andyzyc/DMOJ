package ccc;

import java.util.Scanner;

public class ccc07j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bowl1 = s.nextInt();
        int bowl2 = s.nextInt();
        int bowl3 = s.nextInt();
        int bowlAll = bowl1 + bowl2 + bowl3;
            
        int large = Math.max(bowl1, Math.max(bowl2, bowl3));
        int small = Math.min(bowl1, Math.min(bowl2, bowl3));
        int middle = (bowlAll - large) - small;
        System.out.println(middle);
    }
}
