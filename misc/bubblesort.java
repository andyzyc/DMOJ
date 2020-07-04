package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bubblesort {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-i-1; j++) {
                if (arrList.get(j) > arrList.get(j+1)) {
                    Collections.swap(arrList, j, j+1);
                    System.out.println();
                    for (int k = 0; k < arrList.size(); k++) {
                        System.out.print(arrList.get(k) + " ");
                    }
                }
            }
        }
    }
}
