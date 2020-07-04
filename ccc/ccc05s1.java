package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc05s1 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String phoneNumber = st.nextToken();
            int[] phoneNumberArray = new int[10];
            int N = 10;
            for (int j = 0; j < N; j++) {
                int currentInt = phoneNumber.charAt(j);
                if ((char) currentInt == '-') {
                    N++;
                } else if (currentInt >= 49 && currentInt <= 57) {
                    phoneNumberArray[10-N+j] = currentInt-48;
                } else if (currentInt >= 65 && currentInt <= 67) {
                    phoneNumberArray[10-N+j] = 2;
                } else if (currentInt >= 68 && currentInt <= 70) {
                    phoneNumberArray[10-N+j] = 3;
                } else if (currentInt >= 71 && currentInt <= 73) {
                    phoneNumberArray[10-N+j] = 4;
                } else if (currentInt >= 74 && currentInt <= 76) {
                    phoneNumberArray[10-N+j] = 5;
                } else if (currentInt >= 77 && currentInt <= 79) {
                    phoneNumberArray[10-N+j] = 6;
                } else if (currentInt >= 80 && currentInt <= 83) {
                    phoneNumberArray[10-N+j] = 7;
                } else if (currentInt >= 84 && currentInt <= 86) {
                    phoneNumberArray[10-N+j] = 8;
                } else if (currentInt >= 87 && currentInt <= 90) {
                    phoneNumberArray[10-N+j] = 9;
                }
            }
            int counter = 0;
            int hyphen = 0;
            for (int j = 0; j < 12; j++) {
                if (counter == 3 || counter == 7) {
                    System.out.print("-");
                    hyphen++;
                } else {
                    System.out.print(phoneNumberArray[j-hyphen]);
                }
                counter++;
            }
            System.out.println();
        }
    }
}
