package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ccc10j4 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        while (true) {
            ArrayList<Integer> firstDepth = new ArrayList<Integer>();
            int n = Integer.parseInt(st.nextToken());
            int zeroCaseChecker = 0;
            if (n == 0) {
                break;
            } else if (n == 1) {
                int a = Integer.parseInt(st.nextToken());
                zeroCaseChecker++;
                System.out.println(0);
            } else {

                int[] tempDiff = new int[n-1];
                int a = Integer.parseInt(st.nextToken());
                for (int i = 0; i < n-1; i++) {
                    int b = Integer.parseInt(st.nextToken());
                    tempDiff[i] = b-a;
                    a = b;
                }
                firstDepth.add(tempDiff[0]);

                outerloop:
                for (int i = firstDepth.size(); i < n-1; i++) {
                    for (int j = 0; j < n-1-firstDepth.size(); j++) {
                        if (firstDepth.get(j % firstDepth.size()).equals(tempDiff[j+i])) {
                            //nothing happens
                        } else {
                            firstDepth.add(tempDiff[j+i]);
                            break;
                        }
                        if (j+1 == n-1-firstDepth.size()) {
                            break outerloop;
                        }
                    }
                }
            }

            if (zeroCaseChecker == 0) {
                System.out.println(firstDepth.size());
            }
            st = new StringTokenizer(br.readLine());
        }
    }
}
