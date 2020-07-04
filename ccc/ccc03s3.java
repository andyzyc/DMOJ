package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ccc03s3 {

    public static int counter = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int F = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        boolean[][] floorPlan = new boolean[r][c];
        ArrayList<Integer> roomSize = new ArrayList<Integer>();
        int roomsInst = 0;

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            String[] square = st.nextToken().split("");
            for (int j = 0; j < c; j++) {
                if (square[j].equals("I")) {
                    floorPlan[i][j] = true;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!floorPlan[i][j]) {
                    counter -= counter;
                    calcRoomSize(i, j, r, c, floorPlan);
                    roomSize.add(counter);
                }
            }
        }

        Collections.sort(roomSize);
        Collections.reverse(roomSize);

        while (!roomSize.isEmpty()) {
            if (F - roomSize.get(0) >= 0) {
                F -= roomSize.get(0);
                roomSize.remove(0);
                roomsInst++;
            } else {
                if (roomsInst == 1) {
                    System.out.println(roomsInst + " room, " + F + " square metre(s) left over");
                } else {
                    System.out.println(roomsInst + " rooms, " + F + " square metre(s) left over");
                }
                System.exit(0);
            }
        }
        if (roomsInst == 1) {
            System.out.println(roomsInst + " room, " + F + " square metre(s) left over");
        } else {
            System.out.println(roomsInst + " rooms, " + F + " square metre(s) left over");
        }

    }

    public static boolean[][] calcRoomSize(int i, int j, int r, int c, boolean[][] floorPlan) {
        counter++;
        floorPlan[i][j] = true;

        if (0 <= i + 1 && i + 1 <= r - 1 && 0 <= j && j <= c - 1 && !floorPlan[i + 1][j]) {
            calcRoomSize(i+1, j, r, c, floorPlan);
        }
        if (0 <= i - 1 && i - 1 <= r - 1 && 0 <= j && j <= c - 1 && !floorPlan[i - 1][j]) {
            calcRoomSize(i-1, j, r, c, floorPlan);
        }
        if (0 <= i && i <= r - 1 && 0 <= j + 1 && j + 1 <= c - 1 && !floorPlan[i][j + 1]) {
            calcRoomSize(i, j+1, r, c, floorPlan);
        }
        if (0 <= i && i <= r - 1 && 0 <= j - 1 && j - 1 <= c - 1 && !floorPlan[i][j - 1]) {
            calcRoomSize(i, j-1, r, c, floorPlan);
        }
        return floorPlan;
    }

}
