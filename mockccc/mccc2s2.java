package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class mccc2s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String latin = st.nextToken();
        Deque<Integer> lexo = new ArrayDeque<Integer>();
        lexo.add((int) latin.charAt(0));

        for (int i = 1; i < N; i++) {
            if (latin.charAt(i) > lexo.peekFirst()) {
                lexo.addLast((int) latin.charAt(i));
            } else {
                lexo.addFirst((int) latin.charAt(i));
            }
        }

        for (int i = 0; i < N; i++) {
            char ascii = (char) Integer.parseInt(String.valueOf(lexo.pop()));
            System.out.print(ascii);
        }
    }
}
