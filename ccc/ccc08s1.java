package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc08s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] coldest;
        String[] current;
        coldest = br.readLine().split(" ");
        do {
            current = br.readLine().split(" ");
            if (Integer.parseInt(current[1]) < Integer.parseInt(coldest[1])) {
                coldest = current;
            }
        } while (!current[0].equals("Waterloo"));
        System.out.println(coldest[0]);
    }
}
