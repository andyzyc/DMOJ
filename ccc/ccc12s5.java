package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc12s5 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        int[][] grid = new int[R+1][C+1];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            grid[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = -1;
        }
        for (int i = 1; i <= R; i++) {
            if (grid[i][1] != -1) {
                grid[i][1] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i <= C; i++) {
            if (grid[1][i] != -1) {
                grid[1][i] = 1;
            } else {
                break;
            }
        }

        for (int i = 2; i <= R; i++) {
            for (int j = 2; j <= C; j++) {
                if (grid[i][j] == -1) {
                    continue;
                } else {
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                    if (grid[i-1][j] == -1) {
                        grid[i][j]++;
                    }
                    if (grid[i][j-1] == -1) {
                        grid[i][j]++;
                    }
                }
            }
        }
        System.out.println(grid[R][C]);
    }
}
