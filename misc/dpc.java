package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class dpc {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int[][] activities = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                activities[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int happiness = 0;
        int bored = -1;

        // greedy
        for (int i = 0; i < N; i++) {
            if (bored == 0) {
                if (activities[i][1] >= activities[i][2]) {
                    happiness += activities[i][1];
                    bored = 1;
                } else {
                    happiness += activities[i][2];
                    bored = 2;
                }
            } else if (bored == 1) {
                if (activities[i][0] >= activities[i][2]) {
                    happiness += activities[i][0];
                    bored = 0;
                } else {
                    happiness += activities[i][2];
                    bored = 2;
                }
            } else if (bored == 2) {
                if (activities[i][0] >= activities[i][1]) {
                    happiness += activities[i][0];
                    bored = 0;
                } else {
                    happiness += activities[i][1];
                    bored = 1;
                }
            } else {
                if (Math.max(Math.max(activities[i][0], activities[i][1]), activities[i][2]) == activities[i][0]) {
                    happiness += activities[i][0];
                    bored = 0;
                } else if (Math.max(Math.max(activities[i][0], activities[i][1]), activities[i][2]) == activities[i][1]) {
                    happiness += activities[i][1];
                    bored = 1;
                } else {
                    happiness += activities[i][2];
                    bored = 2;
                }
            }
        }

        System.out.println(happiness);
    }
}
