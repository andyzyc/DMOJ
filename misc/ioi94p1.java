package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ioi94p1 {

    public static int[][] memo = new int[100][100];

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] arrList = new ArrayList[N];
        for (int i = 0 ; i < N; i++) {
            arrList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = -1; j < i; j++) {
                arrList[i].add(Integer.parseInt(st.nextToken()));
            }
        }
        int highestSum = 0;

        System.out.println(maxSum(highestSum, 0, 0, N, arrList));

    }

    public static int maxSum(int highestSum, int iterX, int iterY, int N, ArrayList<Integer>[] arrList) {
        if (iterX + 1 == N) {
            return arrList[iterX].get(iterY);
        } else if (memo[iterX][iterY] != 0) {
            return memo[iterX][iterY];
        } else {
            highestSum = arrList[iterX].get(iterY) + Math.max(maxSum(highestSum, iterX + 1, iterY, N, arrList), maxSum(highestSum, iterX + 1, iterY + 1, N, arrList));
            memo[iterX][iterY] = highestSum;
            return memo[iterX][iterY];
        }
    }

}
