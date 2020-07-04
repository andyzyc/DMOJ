package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc20s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] cell = new int[M+1][N+1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                cell[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<Integer>[] arr = new ArrayList[1000001];
        for (int i = 1; i < 1000001; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        boolean[][] visited = new boolean[M+1][N+1];
        LinkedList q = new LinkedList<Integer>(); // queue
        q.add(1);
        q.add(1);
        while (!q.isEmpty()) {
            int m = (int) q.poll();
            int n = (int) q.poll();
            int x = cell[m][n];
            if (m == M && n == N) {
                System.out.println("yes");
                System.exit(0);
            }
            for (int i = 1; i <= Math.ceil((double)x/2); i++) {
                if (x/i <= M && i <= N && (arr[x].contains(i) || x % i == 0)) {
                    if (!visited[x/i][i]) {
                        q.add(x/i);
                        q.add(i);
                        visited[x/i][i] = true;
                        if (!arr[x].contains(i)) {
                            arr[x].add(i);
                        }
                    }
                }
                if (i <= M && x/i <= N && (arr[x].contains(i) || x % i == 0)) {
                    if (!visited[i][x/i]) {
                        q.add(i);
                        q.add(x/i);
                        visited[i][x/i] = true;
                        if (!arr[x].contains(i)) {
                            arr[x].add(i);
                        }
                    }
                }
            }
        }
        System.out.println("no");
    }
}
