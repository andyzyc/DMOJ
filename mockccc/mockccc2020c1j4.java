package mockccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//INCOMPLETE
public class mockccc2020c1j4 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String house = st.nextToken();
        int ill = 0;

        for (int i = 0; i < N; i++) {
            if (house.charAt(i) == '0') {
                for (int j = 1; j < N; j++) {
                    if (i+j >= N && i-j < 0) {
                        break;
                    } else if (i+j >= N) {
                        if (house.charAt(i-j) == '1') {
                            ill += j;
                            break;
                        }
                    } else if (i-j < 0) {
                        if (house.charAt(i+j) == '1') {
                            ill += j;
                            break;
                        }
                    } else {
                        if (house.charAt(i+j) == '1' || house.charAt(i-j) == '1') {
                            ill += j;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ill);
    }
}
