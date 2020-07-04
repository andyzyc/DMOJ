package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ccc10j5v2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int finalX = Integer.parseInt(st.nextToken());
        int finalY = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[9][9];
        int counter = 0;
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(startX); queue.add(startY);
        queue.add(Integer.MAX_VALUE); queue.add(Integer.MAX_VALUE);


        if (startX == finalX && startY == finalY) {
            System.out.println(0);
            System.exit(0);
        }

        while (!queue.isEmpty()) {
            int currX = queue.poll();
            int currY = queue.poll();
            if (currX == finalX && currY == finalY) {
                break;
            } else if (currX == Integer.MAX_VALUE && currY == Integer.MAX_VALUE) {
                counter++;
                queue.add(Integer.MAX_VALUE); queue.add(Integer.MAX_VALUE);
            } else if (currX < 1 || currX > 8 || currY < 1 || currY > 8 || visited[currX][currY]) {
                // illegal move, do nothing
            } else {
                visited[currX][currY] = true;
                queue.add(currX+1); queue.add(currY+2);
                queue.add(currX+2); queue.add(currY+1);
                queue.add(currX+2); queue.add(currY-1);
                queue.add(currX+1); queue.add(currY-2);
                queue.add(currX-1); queue.add(currY-2);
                queue.add(currX-2); queue.add(currY-1);
                queue.add(currX-2); queue.add(currY+1);
                queue.add(currX-1); queue.add(currY+2);
            }
        }


        System.out.println(counter);
    }
}
