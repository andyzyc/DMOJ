package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc10s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int k = Integer.parseInt(st.nextToken());
        String[] letter = new String[k];
        String[] code = new String[k];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            letter[i] = st.nextToken();
            code[i] = st.nextToken();
        }

        st = new StringTokenizer(br.readLine());
        String[] sequence = st.nextToken().split("");
        String concat = "";

        for (int i = 0; i < sequence.length; i++) {
            concat += sequence[i];
            for (int j = 0; j < code.length; j++) {
                if (code[j].equals(concat)) {
                    System.out.print(letter[j]);
                    concat = "";
                    break;
                }
            }
        }
    }
}
