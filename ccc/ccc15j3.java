package ccc;

import java.util.Scanner;

public class ccc15j3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = "";
        
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            str2 += letter;
            
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                //nothing happens
            } else {
                if ("abc".indexOf(letter) != -1) {
                    str2 = str2.concat("a");
                } else if ("defg".indexOf(letter) != -1) {
                    str2 = str2.concat("e");
                } else if ("hijkl".indexOf(letter) != -1) {
                    str2 = str2.concat("i");
                } else if ("mnopqr".indexOf(letter) != -1) {
                    str2 = str2.concat("o");
                } else if ("stuvwxyz".indexOf(letter) != -1) {
                    str2 = str2.concat("u");
                }
                
                if (letter == 'd' || letter == 'h' || letter == 'n' || letter == 't') {
                    letter += 2;
                    str2 += letter;
                } else if (letter == 'z') {
                    str2 += letter;
                } else {
                    letter += 1;
                    str2 += letter;
                }
            }
        }
        System.out.println(str2);
    }
}
