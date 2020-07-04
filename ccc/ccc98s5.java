package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc98s5 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int numTrips = Integer.parseInt(st.nextToken());
        for (int i = 0; i < numTrips; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            LinkedList<Integer> queue = new LinkedList<Integer>();
            int[][] mountain = new int[n+1][n+1];
            boolean[][] visited = new boolean[n+1][n+1];
            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= n; y++) {
                    st = new StringTokenizer(br.readLine());
                    mountain[y][x] = Integer.parseInt(st.nextToken());
                }
            }
            int finalOxy = 0;
            queue.add(1); queue.add(1); queue.add(0);


            while (!queue.isEmpty()) {
                int currX = queue.poll();
                int currY = queue.poll();
                int currOxy = queue.poll();
                visited[currX][currY] = true;
                if (currX == n && currY == n) {
                    finalOxy = currOxy;
                    break;
                }
                if (mountain[currX][currY] > mountain[1][1]) {
                    currOxy++;
                }
                if (!(currX-1 < 1 || currX-1 > mountain.length-1)) {
                    if (!(visited[currX-1][currY] || Math.abs(mountain[currX-1][currY] - mountain[currX][currY]) > 2)) {
                        queue.add(currX-1); queue.add(currY); queue.add(currOxy);
                    }
                }
                if (!(currX+1 < 1 || currX+1 > mountain.length-1)) {
                    if (!(visited[currX+1][currY] || Math.abs(mountain[currX+1][currY] - mountain[currX][currY]) > 2)) {
                        queue.add(currX+1); queue.add(currY); queue.add(currOxy);
                    }
                }
                if (!(currY-1 < 1 || currY-1 > mountain.length-1)) {
                    if (!(visited[currX][currY-1] || Math.abs(mountain[currX][currY-1] - mountain[currX][currY]) > 2)) {
                        queue.add(currX); queue.add(currY-1); queue.add(currOxy);
                    }
                }
                if (!(currY+1 < 1 || currY+1 > mountain.length-1)) {
                    if (!(visited[currX][currY+1] || Math.abs(mountain[currX][currY+1] - mountain[currX][currY]) > 2)) {
                        queue.add(currX); queue.add(currY+1); queue.add(currOxy);
                    }
                }
            }


            if (finalOxy == 0) {
                System.out.println("CANNOT MAKE THE TRIP");
            } else {
                if (mountain[n][n] > mountain[1][1]) {
                    System.out.println(finalOxy - 1);
                } else {
                    System.out.println(finalOxy);
                }
            }
            System.out.println();
        }
    }
}
