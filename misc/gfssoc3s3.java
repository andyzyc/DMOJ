package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class gfssoc3s3 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        long N = 0;

        try {
            N = Integer.parseInt(st.nextToken());
        } catch (NumberFormatException e) {
            System.out.println(999999998);
            System.exit(0);
        }

        long n = N;
        BigInteger[] total = new BigInteger[(int) (N+1)];
        total[(int) (N-1)] = BigInteger.valueOf(9);

        if (n >= 18) {
            System.out.println(999999998);
            System.exit(0);
        }

        while (N > 1) {
            int multiplier = (int) Math.ceil((double) (N - 2) /(double) 2);
            total[(int) (N-2)] = total[(int) (N-1)].add(BigInteger.valueOf((long) (9 * Math.pow(10, multiplier))));
            N--;
        }
        System.out.println(total[0].mod(BigInteger.valueOf(1000000000)));
    }
}
