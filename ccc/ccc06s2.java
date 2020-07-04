package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//import java.util.StringTokenizer;

public class ccc06s2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        char[] plainText = br.readLine().toCharArray();
        char[] corrCipherText = br.readLine().toCharArray();
        char[] cipherText = br.readLine().toCharArray();
        HashMap<Character, Character> decrypter = new HashMap<Character, Character>();

        // decrypted keys correspond to encrypted values
        for (int i = 0; i < plainText.length; i++) {
            decrypter.put(corrCipherText[i], plainText[i]);
        }

        // setting decrypted keys to "." if cannot determine encrypted values
        for (int i = 0; i < 27; i++) {
            if (decrypter.get(i) == null) {
                decrypter.put(null, (char) (64+i));
            }
        }

        // replace encrypted values to decrypted keys
        for (int i = 0; i < cipherText.length; i++) {
            try {
                cipherText[i] = decrypter.get(cipherText[i]);
            } catch (Exception e) {
                cipherText[i] = '.';
            }
        }

        // output
        System.out.println(cipherText);
    }
}
