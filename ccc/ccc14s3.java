package ccc;

// imports 1, 2, 3, 6 used for BufferedReader, imports 4, 5 used for Deque
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class ccc14s3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {

            // st for newline
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            // initializing deque (will be used as stack)
            Deque<Integer> mountainTop = new ArrayDeque<Integer>();
            Deque<Integer> branch = new ArrayDeque<Integer>();
            Deque<Integer> lake = new ArrayDeque<Integer>();

            // assigning max value to beginning of deque to deny NullPointerException when empty
            mountainTop.push(Integer.MAX_VALUE);
            branch.push(Integer.MAX_VALUE);
            lake.push(Integer.MAX_VALUE);

            // adding mountainTop elements into deque
            for (int j = 0; j < N; j++) {

                // st for newline
                st = new StringTokenizer(br.readLine());

                mountainTop.push(Integer.parseInt(st.nextToken()));
            }

            // branch with N+1 and lake with 0 used for initial comparing
            // (no problems because N+1 will always pop out last, 0 is already in)
            branch.push(N+1);
            lake.push(0);



            // calculations/computations
            for (int j = 0; j < N*2+1; j++) {

                // if mountainTop is consecutive with lake, example 2 and 1
                if (mountainTop.peekFirst()-1 == lake.peekFirst()) {
                    lake.push(mountainTop.pop());
                }

                // if mountainTop is less than branch, example 4 and 6
                else if (mountainTop.peekFirst() < branch.peekFirst()) {
                    branch.push(mountainTop.pop());
                }

                // if branch is consecutive with lake, example 3 and 2
                else if (branch.peekFirst()-1 == lake.peekFirst()) {
                    lake.push(branch.pop());
                }



                // if mountainTop and branch are "empty" (disregarding MAX_VALUE)
                else if (mountainTop.size() == 1 && branch.size() == 1) {
                    System.out.println("Y");
                    break;
                }

                // all previous checks fail, cannot produce output using given restraints
                else {
                    System.out.println("N");
                    break;
                }
            }
        }
    }
}
