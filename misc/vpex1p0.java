package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class vpex1p0 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int x = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int mod = x % N;
        System.out.print((x - mod) / N + " " + mod);
    }
}
