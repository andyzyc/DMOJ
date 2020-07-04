package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dph {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        long[][] grid = new long[H+1][W+1];

        for (int i = 1; i <= H; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for (int j = 1; j <= W; j++) {
                if (input.charAt(j-1) == '#') {
                    grid[i][j] = -1;
                }
            }
        }

        for (int i = 1; i <= H; i++) {
            if (grid[i][1] != -1) {
                grid[i][1] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i <= W; i++) {
            if (grid[1][i] != -1) {
                grid[1][i] = 1;
            } else {
                break;
            }
        }

        for (int i = 2; i <= H; i++) {
            for (int j = 2; j <= W; j++) {
                if (grid[i][j] == -1) {
                    continue;
                } else {
                    grid[i][j] = (grid[i-1][j] + grid[i][j-1]) % 1000000007;
                    if (grid[i-1][j] == -1) {
                        grid[i][j]++;
                    }
                    if (grid[i][j-1] == -1) {
                        grid[i][j]++;
                    }
                }
            }
        }
        System.out.println(grid[H][W]);
    }
}
