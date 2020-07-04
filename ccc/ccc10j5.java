package ccc;

import java.util.Scanner;
import java.util.LinkedList;

public class ccc10j5 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        Scanner sc = new Scanner(System.in);
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int endX = sc.nextInt();
        int endY = sc.nextInt();

        // startX, startY
        Tuple start = new Tuple(startX, startY, 0);
        Tuple end = new Tuple(endX, endY, 0);

        // possible moves from current location
        LinkedList possibleMoves = new LinkedList<Tuple>();

        possibleMoves.add(start);

        while (true) {
            Tuple curr = (Tuple) possibleMoves.poll();

            if (curr.equals(end)) {
                System.out.println(curr.numMoves);
                System.exit(0);
            } else {
                getPossibleMoves(curr, possibleMoves);
            }
        }



    }

    public static void getPossibleMoves(Tuple curr, LinkedList possibleMoves) {
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                // check if legal
                if (i != 0 && j != 0 && i != j && Math.abs(i) + Math.abs(j) == 3) {
                    int newX = curr.valueX + i;
                    int newY = curr.valueY + j;
                    int newNum = curr.numMoves + 1;
                    // check if move is out of bounds
                    if (0 < newX && newX < 9 && 0 < newY && newY < 9) {
                        Tuple newMove = new Tuple(newX, newY, newNum);
                        // add to LinkedList possibleMoves
                        if (!possibleMoves.contains(newMove)) {
                            possibleMoves.add(newMove);
                        }
                    }
                }
            }
        }
    }

    public static class Tuple {
        public int valueX;
        public int valueY;
        public int numMoves;

        // constructor
        public Tuple(int valueX, int valueY, int numMoves) {
            this.valueX = valueX;
            this.valueY = valueY;
            this.numMoves = numMoves;
        }

        // equals method
        public boolean equals(Tuple obj) {
            return this.valueX == obj.valueX && this.valueY == obj.valueY;
        }

        // toString method
        public String toString() {
            return "(" + this.valueX + "," + this.valueY + ")";
        }
    }
}
