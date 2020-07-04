package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ccc13s4 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] sizeComp = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            sizeComp[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sizeComp[x].add(y);
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        ArrayList<Integer> checkedX = new ArrayList<Integer>();
        if (check(x, y, sizeComp, checkedX)) {
            System.out.println("yes");
        } else {
            ArrayList<Integer> checkedY = new ArrayList<Integer>();
            if (check(y, x, sizeComp, checkedY)) {
                System.out.println("no");
            } else {
                System.out.println("unknown");
            }
        }

    }

    public static boolean check(int x, int y, ArrayList<Integer>[] sizeComp, ArrayList<Integer> checked) {
        checked.add(x);
        if (sizeComp[x].contains(y)) {
            return true;
        } else {
            int counter = 0;
            for (int i = 0; i < sizeComp[x].size(); i++) {
                if (checked.contains(sizeComp[x].get(i))) {
                    // do nothing
                } else if (check(sizeComp[x].get(i), y, sizeComp, checked)) {
                    counter++;
                }
                if (counter > 0) {
                    break;
                }
            }
            return counter > 0;
        }
    }

}
