package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class mccc1s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int[][] puzzle = new int[N][N];
        ArrayList<Integer> changeRow = new ArrayList<Integer>();
        ArrayList<Integer> changeCol = new ArrayList<Integer>();
        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                puzzle[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int flag = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (puzzle[0][c] == puzzle[r][c] && flag == 0) {
                    continue;
                } else {
                    if (flag == 0) {
                        changeRow.add(r);
                        flag = 1;
                        c = 0;
                    }
                    if (puzzle[r][c] == 0) {
                        puzzle[r][c] = 1;
                    } else {
                        puzzle[r][c] = 0;
                    }
                }
            }
            flag = 0;
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (puzzle[0][c] == puzzle[r][c]) {
                    continue;
                } else {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        flag = 0;

        outerloop:
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N-1; c++) {
                if (puzzle[r][c] == puzzle[r][c+1]) {
                    continue;
                } else {
                    flag++;
                    break outerloop;
                }
            }
        }

        outerloop:
        for (int c = 0; c < N; c++) {
            for (int r = 0; r < N-1; r++) {
                if (puzzle[r][c] == puzzle[r+1][c]) {
                    continue;
                } else {
                    flag++;
                    break outerloop;
                }
            }
        }

        if (flag == 2) {
            System.out.println(-1);
            System.exit(0);
        }

        for (int c = 0; c < N; c++) {
            if (puzzle[0][c] == 1) {
                changeCol.add(c);
            }
        }

        System.out.println(changeRow.size() + changeCol.size());
        for (int r = 0; r < changeRow.size(); r++) {
            System.out.println("R " + (changeRow.get(r)+1));
        }
        for (int c = 0; c < changeCol.size(); c++) {
            System.out.println("C " + (changeCol.get(c)+1));
        }
    }
}
