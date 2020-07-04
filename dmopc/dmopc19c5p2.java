package dmopc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc19c5p2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        String[] charlieMove = new String[N];
        int[] charlieNum = new int[N];
        String[] botMove = new String[N];
        int[] botNum = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            charlieMove[i] = st.nextToken();
            charlieNum[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            botMove[i] = st.nextToken();
            botNum[i] = Integer.parseInt(st.nextToken());
        }

        int charlieHP = H;
        int botHP = H;
        boolean charlieDodging = false;
        boolean botDodging = false;

        for (int i = 0; i < N; i++) {
            if (charlieMove[i].equals("A")) {
                if (!botDodging) {
                    botHP -= charlieNum[i];
                } else {
                    botDodging = false;
                }
            } else if (charlieMove[i].equals("D")) {
                charlieDodging = true;
                if (botDodging) {
                    botHP -= botNum[i-1];
                    botDodging = false;
                }
            }

            if (botHP <= 0) {
                System.out.println("VICTORY");
                System.exit(0);
            }

            if (botMove[i].equals("A")) {
                if (!charlieDodging) {
                    charlieHP -= botNum[i];
                } else {
                    charlieDodging = false;
                }
            } else if (botMove[i].equals("D")) {
                botDodging = true;
                if (charlieDodging) {
                    charlieHP -= charlieNum[i];
                    charlieDodging = false;
                }
            }

            if (charlieHP <= 0) {
                System.out.println("DEFEAT");
                System.exit(0);
            }
        }
        if (botDodging) {
            botHP -= botNum[N-1];
        }
        if (botHP <= 0) {
            System.out.println("VICTORY");
        } else {
            System.out.println("TIE");
        }
    }
}
