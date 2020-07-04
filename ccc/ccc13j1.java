package ccc;

import java.util.Scanner;

public class ccc13j1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int yAge = s.nextInt();
    int mAge = s.nextInt();
    int oAge = (mAge - yAge) + mAge;
    System.out.println(oAge);
    }
}
