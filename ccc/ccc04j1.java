package ccc;

import java.util.Scanner;

public class ccc04j1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tiles = s.nextInt();
        int square = (int) (Math.floor(Math.sqrt(tiles)));
        
        System.out.println("The largest square has side length " + square + ".");
    }
}
