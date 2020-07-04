package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc03s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            String[] lastWord = new String[4];
            for (int j = 0; j < 4; j++) {
                String[] temp = br.readLine().split(" ");
                lastWord[j] = temp[temp.length-1];
                lastWord[j] = lastWord[j].toLowerCase();
                StringBuilder letter = new StringBuilder();
                for (int k = lastWord[j].length()-1; k >= 0; k--) {
                    letter.append(lastWord[j].charAt(k));
                    String charLetter = Character.toString(lastWord[j].charAt(k));
                    if (charLetter.equals("a") || charLetter.equals("e") || charLetter.equals("i") || charLetter.equals("o") || charLetter.equals("u")) {
                        lastWord[j] = String.valueOf(letter);
                        break;
                    }
                }
            }

            if (lastWord[0].equals(lastWord[1]) && lastWord[0].equals(lastWord[2]) && lastWord[0].equals(lastWord[3])) {
                System.out.println("perfect");
            } else if (lastWord[0].equals(lastWord[1]) && lastWord[2].equals(lastWord[3])) {
                System.out.println("even");
            } else if (lastWord[0].equals(lastWord[2]) && lastWord[1].equals(lastWord[3])) {
                System.out.println("cross");
            } else if (lastWord[0].equals(lastWord[3]) && lastWord[1].equals(lastWord[2])) {
                System.out.println("shell");
            } else {
                System.out.println("free");
            }
        }
    }
}
