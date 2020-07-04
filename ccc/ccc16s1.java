package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.StringTokenizer;

public class ccc16s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int counter = 0;
        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> second = new ArrayList<String>();
        String fir = br.readLine();
        String sec = br.readLine();

        if (fir.length() != sec.length()) {
            System.out.println("N");
            System.exit(0);
        }

        for (int i = 0; i < fir.length(); i++) {
            first.add(String.valueOf(fir.charAt(i)));
            second.add(String.valueOf(sec.charAt(i)));
        }
        Collections.sort(first);
        Collections.sort(second);

        for (int i = fir.length()-1; i >= 0; i--) {
            if (second.contains(first.get(i))) {
                second.remove(first.get(i));
                first.remove(first.get(i));
            } else if (second.contains("*")) {
                second.remove("*");
                first.remove(first.get(i));
            } else {
                System.out.println("N");
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("A");
        }
    }
}
