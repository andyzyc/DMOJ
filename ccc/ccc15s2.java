package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//INCOMPLETE
public class ccc15s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int J = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int satisfiedRequests = 0;

        // jerseys in stock
        int S = 0;
        int M = 0;
        int L = 0;

        // jersey sizes requested
        HashMap<String, Integer> requestSize = new HashMap<String, Integer>();
        requestSize.put("S", 0);
        requestSize.put("M", 0);
        requestSize.put("L", 0);

        // jersey numbers requested
        boolean[] requestNum = new boolean[A];

        // recording jersey sizes in stock
        for (int i = 0; i < J; i++) {
            st = new StringTokenizer(br.readLine());
            String j = st.nextToken();
            if (j.equals("S")) {
                S++;
            } else if (j.equals("M")) {
                M++;
            } else if (j.equals("L")) {
                L++;
            }
        }

        // recording requested jersey sizes and numbers
        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            String currSize = st.nextToken();
            int currNum = Integer.parseInt(st.nextToken());
            if (currSize.equals("S")) {
                requestSize.put("S", requestSize.get("S")+1);
            } else if (currSize.equals("M")) {
                requestSize.put("M", requestSize.get("M")+1);
            } else if (currSize.equals("L")) {
                requestSize.put("L", requestSize.get("L")+1);
            }
            requestNum[currNum-1] = true;
        }

        // check how many requests can be satisfied
        for (int i = 0; i < J; i++) {
            if (requestSize.get("L") > 0 && L > 0) {
                requestSize.put("L", requestSize.get("L")-1);
                L--;

            }
        }
    }
}
