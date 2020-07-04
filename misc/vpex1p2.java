package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class vpex1p2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int[] people = new int[N];
        st = new StringTokenizer(br.readLine());
        int wrong = 0;
        int totalAmount = 0;
        int correctAmount = 0;

        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
            totalAmount += people[i];
        }

        correctAmount = totalAmount / N;

        for (int i = 0; i < N; i++) {
            if (people[i] != correctAmount) {
                wrong++;
            }
        }

        System.out.println(wrong);
    }
}
