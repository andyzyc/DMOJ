package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc19c4p1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("");
            int counter = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("(")) {
                    counter++;
                } else if (str[j].equals(")")) {
                    counter--;
                } else if (str[j].equals("-")) {
                    counter = 1024;
                }
                if (counter < 0) {
                    System.out.println("NO");
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("YES");
            } else if (counter > 0) {
                System.out.println("NO");
            }
        }
    }
}
