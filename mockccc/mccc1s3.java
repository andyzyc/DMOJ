package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//INCOMPLETE
public class mccc1s3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String S = st.nextToken();
        int Q = Integer.parseInt(st.nextToken());
        ArrayList<String> sam = new ArrayList<String>();
        sam.add("9");
        sam.add(S);

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            String query = st.nextToken();

            if (query.equals("C")) {
                int x = Integer.parseInt(st.nextToken());
                String c = st.nextToken();
                String A = sam.get(x) + c;
                sam.add(A);

            } else if (query.equals("Q")) {
                String s = st.nextToken();

                outerloop:
                for (int j = 0; j < s.length(); j++) {
                    int subLength = s.length()-j;

                    for (int k = 1; k < sam.size(); k++) {
                        try {
                            if (s.substring(0, subLength).equals(sam.get(k).substring(0, subLength))) {
                                System.out.println(k);
                                break outerloop;
                            }
                        } catch (Exception e) {
                            continue;
                        }
                    }
                    if (j == s.length()-1) {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}
