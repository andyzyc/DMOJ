package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc07s3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int minSeparation = Integer.MAX_VALUE;
        int currSeparation = 0;
        ArrayList<Integer>[] friends = new ArrayList[10000];
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            friends[x] = new ArrayList<Integer>();
            friends[x].add(y);
        }
        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int init = x;
            if (x == 0 && y == 0) {
                System.exit(0);
            } else {
                System.out.println(separation(init, x, y, friends, currSeparation, minSeparation));
            }
        }
    }
    public static int separation(int init, int x, int y, ArrayList<Integer>[] friends, int currSeparation, int minSeparation) {
        if (friends[x].contains(y)) {
            if (currSeparation < minSeparation) {
                minSeparation = currSeparation;
            }
        }
        if (x == init) {
            return minSeparation;
        } else {
            return Integer.MAX_VALUE;
        }
//        for (Integer i : friends[x]) {
//            separation(init, i, y, friends, currSeparation+1, minSeparation);
//        }
    }
}
