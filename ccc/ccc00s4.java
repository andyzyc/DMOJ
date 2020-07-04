package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc00s4 {

    // memoization
    public static int[] memo = new int[5281];

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        // initializing variables
        Arrays.fill(memo, -1);

        // exact distance needed to clear
        int distance = Integer.parseInt(st.nextToken());

        // number of unique clubs
        st = new StringTokenizer(br.readLine());
        int numClubs = Integer.parseInt(st.nextToken());

        // distance cleared of each unique club
        int[] clubDist = new int[numClubs];
        for (int i = 0; i < numClubs; i++) {
            st = new StringTokenizer(br.readLine());
            clubDist[i] = Integer.parseInt(st.nextToken());
        }


        // calling recursive function
        int n = f(distance, numClubs, clubDist);

        // output
        if (n >= 1000000000) {
            System.out.println("Roberta acknowledges defeat.");
        } else {
            System.out.println("Roberta wins in " + n + " strokes.");
        }

    }

    // recursion
    public static int f(int remainingDistance, int numClubs, int[] clubDist) {

        // check if overshot
        if (remainingDistance < 0) {
            return (int) 1e9;
        }

        // check if reached goal
        else if (remainingDistance == 0) {
            return 0;
        }

        // check if we calculated the result of a certain distance
        else if (memo[remainingDistance] != -1) {
            return memo[remainingDistance];
        }

        // calculate the result of this distance
        int u = (int) 1e9;
        for (int i = 0; i < numClubs; i++) {
            u = Math.min(u, f(remainingDistance-clubDist[i],numClubs,clubDist)+1);
        }

        // record result of this distance, for memoization
        memo[remainingDistance] = u;

        return memo[remainingDistance];
    }

}
