package mockccc;

import java.util.Scanner;

public class mccc19c1j2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String cor = "pusheen";
        int errors = 0;
        
        for (int i = 0; i < 7; i++) {
            if (str.charAt(i) == cor.charAt(i)) {
                //nothing happens
            } else {
                errors++;
            }
        }
        System.out.println(errors);
    }
}
