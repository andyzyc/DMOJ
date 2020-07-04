package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc18j4s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] flowerGrid = new int[N][N];

        // initializing altered flower grid
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                flowerGrid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 0 degrees counter clockwise
        if (flowerGrid[0][0] < flowerGrid[0][1] && flowerGrid[0][0] < flowerGrid[1][0]) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(flowerGrid[i][j] + " ");
                }
                System.out.println();
            }
        }

        // 90 degrees counter clockwise
        else if (flowerGrid[0][0] < flowerGrid[0][1] && flowerGrid[0][0] > flowerGrid[1][0]) {
            for (int i = 0; i < N; i++) {
                for (int j = N-1; j > -1; j--) {
                    System.out.print(flowerGrid[j][i] + " ");
                }
                System.out.println();
            }
        }

        // 180 degrees counter clockwise
        else if (flowerGrid[0][0] > flowerGrid[0][1] && flowerGrid[0][0] > flowerGrid[1][0]) {
            for (int i = N-1; i > -1; i--) {
                for (int j = N-1; j > -1; j--) {
                    System.out.print(flowerGrid[i][j] + " ");
                }
                System.out.println();
            }
        }

        // 270 degrees counter clockwise
        else if (flowerGrid[0][0] > flowerGrid[0][1] && flowerGrid[0][0] < flowerGrid[1][0]) {
            for (int i = N-1; i > -1; i--) {
                for (int j = 0; j < N; j++) {
                    System.out.print(flowerGrid[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
